import static org.junit.Assert.*;
import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void test-file(){
        assertEquals(getLinks(test-file.md), {"https://something.com", "some-page.html"}); 
    }
}