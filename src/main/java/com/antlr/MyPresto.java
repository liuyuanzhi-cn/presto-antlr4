package com.antlr;

import com.antlr.out.SqlBaseLexer;
import com.antlr.out.SqlBaseParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.InputMismatchException;

public class MyPresto {
    public static boolean run(String expr) {
        ANTLRInputStream in = new ANTLRInputStream(expr);
        SqlBaseLexer lexer = new SqlBaseLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlBaseParser parser = new SqlBaseParser(tokens);
        SqlBaseParser.QueryContext query = parser.query();
        // SqlBaseParser.QueryNoWithContext queryNoWithContext = parser.queryNoWith();
        // SqlBaseParser.QuerySpecificationContext querySpecificationContext = parser.querySpecification();
        // SqlBaseParser.QueryPrimaryContext queryPrimaryContext = parser.queryPrimary();
        // SqlBaseParser.QueryTermContext queryTermContext = parser.queryTerm();
        if (query.exception instanceof InputMismatchException) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) throws Exception {

        String[] testStr = {
                "SELECT * FROM TABLE_NAME"
        };

        for (String s : testStr) {
            if (run(s)) {
                System.out.println("Input expr:" + s + "; syntax is right!");
            } else {
                System.out.println("Input expr:" + s + "; syntax is wrong!");
            }
        }
    }
}
