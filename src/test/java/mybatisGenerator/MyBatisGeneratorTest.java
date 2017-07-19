package mybatisGenerator;

import junit.framework.TestCase;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by feiyu on 2017/7/5.
 */
public class MyBatisGeneratorTest extends TestCase {

    private String confFilePath = "/mybatisGeneratorConfig.xml";

    public final void testGenerator() throws Exception {

        List<String> warnings = new ArrayList<String>();

        confFilePath = this.getClass().getResource(confFilePath).getFile();

        File configFile = new File(confFilePath);

        Configuration config = new ConfigurationParser(warnings).parseConfiguration(configFile);

        DefaultShellCallback callback = new DefaultShellCallback(true);

        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);

        myBatisGenerator.generate(null);
        }

        }