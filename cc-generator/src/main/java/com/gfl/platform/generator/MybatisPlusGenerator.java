package com.gfl.platform.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.List;

public class MybatisPlusGenerator {
//"这里按需要修改"的地方改动下就可以用于生成代码了
    public static DataSourceConfig getDataSourceConfig(){
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");//数据库用户名，这里按需要修改
        dsc.setPassword("");//数据库密码，这里按需要修改
        //数据库连接的url，这里按需要修改
        dsc.setUrl("jdbc:mysql://localhost:3306/cc_tech_test?useUnicode=true&characterEncoding=utf8");
        return dsc;
    }


    public static void generate(DataSourceConfig dataSourceConfig, String projectDir, String moduleName){
        AutoGenerator mpg = new AutoGenerator();
        String codeDir = "/src/main/java";
        String xmlDir = "/src/main/resources/mapper";

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(projectDir + codeDir);
        gc.setFileOverride(true);
        gc.setActiveRecord(true);
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        gc.setAuthor("Generator");

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);

        // 数据源配置

        mpg.setDataSource(dataSourceConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //strategy.setTablePrefix(new String[]{"co_"});
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
//        strategy.setInclude(new String[] { "co_order", "co_sub_order", "co_order_detail", "co_order_trace", "ps_express_info", "ps_deliver_month_bill", "ca_user", "ca_account_role"});
        strategy.setInclude(new String[] { "co_cart" }); // 需要生成的表，这里按需要修改
        strategy.setSuperMapperClass("com.gfl.platform.base.SuperMapper");
        strategy.setSuperEntityClass("com.gfl.platform.base.SuperEntity");
        //strategy.setSuperServiceImplClass("com.cc.platform.base.SuperServiceImpl");
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.gfl.platform");
        //pc.setModuleName(moduleName);
        mpg.setPackageInfo(pc);

        // 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
        InjectionConfig cfg = new InjectionConfig() {
            public void initMap() {}
        };


        List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
        FileOutConfig mapperXml = new FileOutConfig("/templates/mapper.xml.vm") {
            public String outputFile(TableInfo tableInfo) {
                return projectDir + xmlDir + "/" + tableInfo.getEntityName() + ".xml";
            }
        };

        // 调整 xml 生成目录演示
//        focList.add(mapperXml);
//        cfg.setFileOutConfigList(focList);
//        mpg.setCfg(cfg);

        //focList = new ArrayList<FileOutConfig>();
        /*FileOutConfig mapperJava = new FileOutConfig("/templates/mapper.java.vm") {
            public String outputFile(TableInfo tableInfo) {
                return projectDir + xmlDir + "/" + tableInfo.getEntityName() + ".java";
            }
        };

        FileOutConfig entityJava = new FileOutConfig("/templates/entity.java.vm") {
            public String outputFile(TableInfo tableInfo) {
                return projectDir + xmlDir + "/" + tableInfo.getEntityName() + ".java";
            }
        };*/

        // 调整 xml 生成目录演示
        focList.add(mapperXml);
        //focList.add(mapperJava);
        //focList.add(entityJava);
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 关闭默认 xml 生成，调整生成 至 根目录
        TemplateConfig tc = new TemplateConfig();
        tc.setXml(null);
        tc.setController(null);
        //tc.setService(null);
        //tc.setServiceImpl(null);
        mpg.setTemplate(tc);

        mpg.execute();
    }

    /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {
        DataSourceConfig dataSourceConfig  = MybatisPlusGenerator.getDataSourceConfig();
        MybatisPlusGenerator.generate(dataSourceConfig, "C:\\cc-root\\cc-entity", "xxx");//xxx可以随意写，，这里按需要修改
//        MybatisPlusGenerator.generate(dataSourceConfig, "D:\\logs", "order");
    }
}

