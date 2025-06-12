import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TestMyLanguage {
    public static void main(String[] args) throws Exception {
        // Read the input file
        CharStream input = CharStreams.fromFileName("toTest.txt");

        // Create lexer and parser
        MyLanguageLexer lexer = new MyLanguageLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyLanguageParser parser = new MyLanguageParser(tokens);

        // Parse and generate the parse tree
        ParseTree tree = parser.program(); // 'root' is your start rule

        // Print the parse tree
        System.out.println(tree.toStringTree(parser));
    }
}
