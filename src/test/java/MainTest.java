import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class MainTest {

    @Ignore
    @Test
    public void name() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Main.print(new PrintStream(out));
        String s = out.toString();
        Assert.assertEquals("Hello, World!", s);
    }
}
