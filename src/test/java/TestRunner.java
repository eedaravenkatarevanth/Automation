import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import package1.Test1;
import package1.Test2;

@Suite
@SelectClasses({parameterizesdTest.class})
@SelectPackages({"package1"})
public class TestRunner {
}
