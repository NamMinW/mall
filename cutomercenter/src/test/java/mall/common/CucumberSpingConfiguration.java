package mall.common;

import io.cucumber.spring.CucumberContextConfiguration;
import mall.CutomercenterApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CutomercenterApplication.class })
public class CucumberSpingConfiguration {}
