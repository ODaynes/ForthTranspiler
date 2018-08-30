import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.util.List;

/**
 * Created by Owen Daynes on 07/03/2018.
 */
public class ExpressionAnalyser {

    public static void main(String[] args) {

        String input = "";

        if(args.length < 2) {
            System.out.println("Please provide at least a read_from path and a write_to path");
            System.out.println("Format: <READ_PATH> <WRITE_PATH> <ERROR_LOG_PATH>?");
            System.exit(-1);
        } else {
            try {
                input = FileIO.getFileAsString(args[0]);
                System.out.println("File successfully read");
                System.out.println();
            } catch (IOException e) {
                System.out.println("File cannot be read");
                System.exit(-1);
            }
        }

        GrammarLexer lexer = new GrammarLexer(CharStreams.fromString(input));
        GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));

        StatementVisitor visitor = new StatementVisitor();

        String postfix = visitor.visit(parser.prog());

        try {
            FileIO.writeStringToFile(args[1], postfix);
            System.out.println("Program compiled and written to file at path '" + args[1] + "'");
        } catch (IOException e) {
            System.out.println("Compiled code could not be written to file at path '" + args[1] + "'");
        }

        System.out.println();

        List<String> errorList = visitor.getErrorList();
        String errors = "";

        if(errorList.size() > 0) {
            for(String errorMsg: errorList) {
                errors += errorMsg + "\n";
            }
            System.out.println(errors);
            if(args.length > 2) {
                try {
                    FileIO.writeStringToFile(args[2], errors);
                    System.out.println();
                } catch (IOException e) {
                    System.out.println("File at path '" + args[2] + "' cannot be overwritten.");
                }
            }
        }

        System.out.println("Compiled code\n");

        System.out.println(postfix);

        System.out.println();
    }
}
