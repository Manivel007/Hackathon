package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

					features= {".//Features/"},
//					features= {"@target/rerun.txt"},
					// features= {".//Features/TS_01_Bookshelf.feature"},
//					features= {".//Features/TS_02_living.feature"},
//					features= {".//Features/TS_03_GiftCard.feature"},
//					features= {".//Features/TS_04_giftcardvalidation.feature"},
//					features= {".//Features/TS_05_Bookandliving.feature"},
//					features= {".//Features/TS_06_GiftcardSmoke.feature"},
//					features= {".//Features/TS_01_Bookshelf.feature",".//Features/TS_02_living.feature",".//Features/TS_05_Bookandliving.feature",".//Features/TS_06_GiftcardSmoke.feature"},
					glue="stepDefinition",
					plugin= {"pretty", "html:reports/myreport.html", 
							  "rerun:target/rerun.txt",
							  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							},
							
					dryRun=false,    // checks mapping between scenario steps and step definition methods
					monochrome=true,    // to avoid junk characters in output
					publish=true
			//		tags="@smoke"// to publish report in cucumber server
					//tags="@sanity"  // this will execute scenarios tagged with @sanity
					//tags="@regression"
					//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
					//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
					//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
		)
public class TestRunner {

		}
