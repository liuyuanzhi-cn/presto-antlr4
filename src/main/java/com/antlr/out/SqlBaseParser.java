// Generated from /home/liuyuanzhi/IdeaProjects/MyPresto/src/main/java/com/antlr/SqlBase.g4 by ANTLR 4.8
package com.antlr.out;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ADD=10, ADMIN=11, ALL=12, ALTER=13, ANALYZE=14, AND=15, ANY=16, ARRAY=17, 
		AS=18, ASC=19, AT=20, BERNOULLI=21, BETWEEN=22, BY=23, CALL=24, CALLED=25, 
		CASCADE=26, CASE=27, CAST=28, CATALOGS=29, COLUMN=30, COLUMNS=31, COMMENT=32, 
		COMMIT=33, COMMITTED=34, CONSTRAINT=35, CREATE=36, CROSS=37, CUBE=38, 
		CURRENT=39, CURRENT_DATE=40, CURRENT_ROLE=41, CURRENT_TIME=42, CURRENT_TIMESTAMP=43, 
		CURRENT_USER=44, DATA=45, DATE=46, DAY=47, DEALLOCATE=48, DELETE=49, DESC=50, 
		DESCRIBE=51, DETERMINISTIC=52, DISTINCT=53, DISTRIBUTED=54, DROP=55, ELSE=56, 
		END=57, ESCAPE=58, EXCEPT=59, EXCLUDING=60, EXECUTE=61, EXISTS=62, EXPLAIN=63, 
		EXTRACT=64, FALSE=65, FILTER=66, FIRST=67, FOLLOWING=68, FOR=69, FORMAT=70, 
		FROM=71, FULL=72, FUNCTION=73, FUNCTIONS=74, GRANT=75, GRANTED=76, GRANTS=77, 
		GRAPHVIZ=78, GROUP=79, GROUPING=80, HAVING=81, HOUR=82, IF=83, IGNORE=84, 
		IN=85, INCLUDING=86, INNER=87, INPUT=88, INSERT=89, INTERSECT=90, INTERVAL=91, 
		INTO=92, IO=93, IS=94, ISOLATION=95, JSON=96, JOIN=97, LANGUAGE=98, LAST=99, 
		LATERAL=100, LEFT=101, LEVEL=102, LIKE=103, LIMIT=104, LOCALTIME=105, 
		LOCALTIMESTAMP=106, LOGICAL=107, MAP=108, MINUTE=109, MONTH=110, NATURAL=111, 
		NFC=112, NFD=113, NFKC=114, NFKD=115, NO=116, NONE=117, NORMALIZE=118, 
		NOT=119, NULL=120, NULLIF=121, NULLS=122, ON=123, ONLY=124, OPTION=125, 
		OR=126, ORDER=127, ORDINALITY=128, OUTER=129, OUTPUT=130, OVER=131, PARTITION=132, 
		PARTITIONS=133, POSITION=134, PRECEDING=135, PREPARE=136, PRIVILEGES=137, 
		PROPERTIES=138, RANGE=139, READ=140, RECURSIVE=141, RENAME=142, REPEATABLE=143, 
		REPLACE=144, RESET=145, RESPECT=146, RESTRICT=147, RETURN=148, RETURNS=149, 
		REVOKE=150, RIGHT=151, ROLE=152, ROLES=153, ROLLBACK=154, ROLLUP=155, 
		ROW=156, ROWS=157, SCHEMA=158, SCHEMAS=159, SECOND=160, SELECT=161, SERIALIZABLE=162, 
		SESSION=163, SET=164, SETS=165, SHOW=166, SOME=167, SQL=168, START=169, 
		STATS=170, SUBSTRING=171, SYSTEM=172, TABLE=173, TABLES=174, TABLESAMPLE=175, 
		TEXT=176, THEN=177, TIME=178, TIMESTAMP=179, TO=180, TRANSACTION=181, 
		TRUE=182, TRY_CAST=183, TYPE=184, UESCAPE=185, UNBOUNDED=186, UNCOMMITTED=187, 
		UNION=188, UNNEST=189, USE=190, USER=191, USING=192, VALIDATE=193, VALUES=194, 
		VERBOSE=195, VIEW=196, WHEN=197, WHERE=198, WITH=199, WORK=200, WRITE=201, 
		YEAR=202, ZONE=203, EQ=204, NEQ=205, LT=206, LTE=207, GT=208, GTE=209, 
		PLUS=210, MINUS=211, ASTERISK=212, SLASH=213, PERCENT=214, CONCAT=215, 
		STRING=216, UNICODE_STRING=217, BINARY_LITERAL=218, INTEGER_VALUE=219, 
		DECIMAL_VALUE=220, DOUBLE_VALUE=221, IDENTIFIER=222, DIGIT_IDENTIFIER=223, 
		QUOTED_IDENTIFIER=224, BACKQUOTED_IDENTIFIER=225, TIME_WITH_TIME_ZONE=226, 
		TIMESTAMP_WITH_TIME_ZONE=227, DOUBLE_PRECISION=228, SIMPLE_COMMENT=229, 
		BRACKETED_COMMENT=230, WS=231, UNRECOGNIZED=232, DELIMITER=233;
	public static final int
		RULE_singleStatement = 0, RULE_standaloneExpression = 1, RULE_standaloneRoutineBody = 2, 
		RULE_statement = 3, RULE_query = 4, RULE_with = 5, RULE_tableElement = 6, 
		RULE_columnDefinition = 7, RULE_likeClause = 8, RULE_properties = 9, RULE_property = 10, 
		RULE_sqlParameterDeclaration = 11, RULE_routineCharacteristics = 12, RULE_routineCharacteristic = 13, 
		RULE_alterRoutineCharacteristics = 14, RULE_alterRoutineCharacteristic = 15, 
		RULE_routineBody = 16, RULE_returnStatement = 17, RULE_language = 18, 
		RULE_determinism = 19, RULE_nullCallClause = 20, RULE_queryNoWith = 21, 
		RULE_queryTerm = 22, RULE_queryPrimary = 23, RULE_sortItem = 24, RULE_querySpecification = 25, 
		RULE_groupBy = 26, RULE_groupingElement = 27, RULE_groupingSet = 28, RULE_namedQuery = 29, 
		RULE_setQuantifier = 30, RULE_selectItem = 31, RULE_relation = 32, RULE_joinType = 33, 
		RULE_joinCriteria = 34, RULE_sampledRelation = 35, RULE_sampleType = 36, 
		RULE_aliasedRelation = 37, RULE_columnAliases = 38, RULE_relationPrimary = 39, 
		RULE_expression = 40, RULE_booleanExpression = 41, RULE_predicate = 42, 
		RULE_valueExpression = 43, RULE_primaryExpression = 44, RULE_string = 45, 
		RULE_nullTreatment = 46, RULE_timeZoneSpecifier = 47, RULE_comparisonOperator = 48, 
		RULE_comparisonQuantifier = 49, RULE_booleanValue = 50, RULE_interval = 51, 
		RULE_intervalField = 52, RULE_normalForm = 53, RULE_types = 54, RULE_type = 55, 
		RULE_typeParameter = 56, RULE_baseType = 57, RULE_whenClause = 58, RULE_filter = 59, 
		RULE_over = 60, RULE_windowFrame = 61, RULE_frameBound = 62, RULE_explainOption = 63, 
		RULE_transactionMode = 64, RULE_levelOfIsolation = 65, RULE_callArgument = 66, 
		RULE_privilege = 67, RULE_qualifiedName = 68, RULE_grantor = 69, RULE_principal = 70, 
		RULE_roles = 71, RULE_identifier = 72, RULE_number = 73, RULE_nonReserved = 74;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "standaloneExpression", "standaloneRoutineBody", "statement", 
			"query", "with", "tableElement", "columnDefinition", "likeClause", "properties", 
			"property", "sqlParameterDeclaration", "routineCharacteristics", "routineCharacteristic", 
			"alterRoutineCharacteristics", "alterRoutineCharacteristic", "routineBody", 
			"returnStatement", "language", "determinism", "nullCallClause", "queryNoWith", 
			"queryTerm", "queryPrimary", "sortItem", "querySpecification", "groupBy", 
			"groupingElement", "groupingSet", "namedQuery", "setQuantifier", "selectItem", 
			"relation", "joinType", "joinCriteria", "sampledRelation", "sampleType", 
			"aliasedRelation", "columnAliases", "relationPrimary", "expression", 
			"booleanExpression", "predicate", "valueExpression", "primaryExpression", 
			"string", "nullTreatment", "timeZoneSpecifier", "comparisonOperator", 
			"comparisonQuantifier", "booleanValue", "interval", "intervalField", 
			"normalForm", "types", "type", "typeParameter", "baseType", "whenClause", 
			"filter", "over", "windowFrame", "frameBound", "explainOption", "transactionMode", 
			"levelOfIsolation", "callArgument", "privilege", "qualifiedName", "grantor", 
			"principal", "roles", "identifier", "number", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'('", "')'", "','", "'?'", "'->'", "'['", "']'", "'=>'", 
			"'ADD'", "'ADMIN'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'ANY'", 
			"'ARRAY'", "'AS'", "'ASC'", "'AT'", "'BERNOULLI'", "'BETWEEN'", "'BY'", 
			"'CALL'", "'CALLED'", "'CASCADE'", "'CASE'", "'CAST'", "'CATALOGS'", 
			"'COLUMN'", "'COLUMNS'", "'COMMENT'", "'COMMIT'", "'COMMITTED'", "'CONSTRAINT'", 
			"'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", "'CURRENT_DATE'", "'CURRENT_ROLE'", 
			"'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CURRENT_USER'", "'DATA'", 
			"'DATE'", "'DAY'", "'DEALLOCATE'", "'DELETE'", "'DESC'", "'DESCRIBE'", 
			"'DETERMINISTIC'", "'DISTINCT'", "'DISTRIBUTED'", "'DROP'", "'ELSE'", 
			"'END'", "'ESCAPE'", "'EXCEPT'", "'EXCLUDING'", "'EXECUTE'", "'EXISTS'", 
			"'EXPLAIN'", "'EXTRACT'", "'FALSE'", "'FILTER'", "'FIRST'", "'FOLLOWING'", 
			"'FOR'", "'FORMAT'", "'FROM'", "'FULL'", "'FUNCTION'", "'FUNCTIONS'", 
			"'GRANT'", "'GRANTED'", "'GRANTS'", "'GRAPHVIZ'", "'GROUP'", "'GROUPING'", 
			"'HAVING'", "'HOUR'", "'IF'", "'IGNORE'", "'IN'", "'INCLUDING'", "'INNER'", 
			"'INPUT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", "'INTO'", "'IO'", 
			"'IS'", "'ISOLATION'", "'JSON'", "'JOIN'", "'LANGUAGE'", "'LAST'", "'LATERAL'", 
			"'LEFT'", "'LEVEL'", "'LIKE'", "'LIMIT'", "'LOCALTIME'", "'LOCALTIMESTAMP'", 
			"'LOGICAL'", "'MAP'", "'MINUTE'", "'MONTH'", "'NATURAL'", "'NFC'", "'NFD'", 
			"'NFKC'", "'NFKD'", "'NO'", "'NONE'", "'NORMALIZE'", "'NOT'", "'NULL'", 
			"'NULLIF'", "'NULLS'", "'ON'", "'ONLY'", "'OPTION'", "'OR'", "'ORDER'", 
			"'ORDINALITY'", "'OUTER'", "'OUTPUT'", "'OVER'", "'PARTITION'", "'PARTITIONS'", 
			"'POSITION'", "'PRECEDING'", "'PREPARE'", "'PRIVILEGES'", "'PROPERTIES'", 
			"'RANGE'", "'READ'", "'RECURSIVE'", "'RENAME'", "'REPEATABLE'", "'REPLACE'", 
			"'RESET'", "'RESPECT'", "'RESTRICT'", "'RETURN'", "'RETURNS'", "'REVOKE'", 
			"'RIGHT'", "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", 
			"'SCHEMA'", "'SCHEMAS'", "'SECOND'", "'SELECT'", "'SERIALIZABLE'", "'SESSION'", 
			"'SET'", "'SETS'", "'SHOW'", "'SOME'", "'SQL'", "'START'", "'STATS'", 
			"'SUBSTRING'", "'SYSTEM'", "'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TEXT'", 
			"'THEN'", "'TIME'", "'TIMESTAMP'", "'TO'", "'TRANSACTION'", "'TRUE'", 
			"'TRY_CAST'", "'TYPE'", "'UESCAPE'", "'UNBOUNDED'", "'UNCOMMITTED'", 
			"'UNION'", "'UNNEST'", "'USE'", "'USER'", "'USING'", "'VALIDATE'", "'VALUES'", 
			"'VERBOSE'", "'VIEW'", "'WHEN'", "'WHERE'", "'WITH'", "'WORK'", "'WRITE'", 
			"'YEAR'", "'ZONE'", "'='", null, "'<'", "'<='", "'>'", "'>='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ADD", "ADMIN", 
			"ALL", "ALTER", "ANALYZE", "AND", "ANY", "ARRAY", "AS", "ASC", "AT", 
			"BERNOULLI", "BETWEEN", "BY", "CALL", "CALLED", "CASCADE", "CASE", "CAST", 
			"CATALOGS", "COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMMITTED", "CONSTRAINT", 
			"CREATE", "CROSS", "CUBE", "CURRENT", "CURRENT_DATE", "CURRENT_ROLE", 
			"CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "DATA", "DATE", 
			"DAY", "DEALLOCATE", "DELETE", "DESC", "DESCRIBE", "DETERMINISTIC", "DISTINCT", 
			"DISTRIBUTED", "DROP", "ELSE", "END", "ESCAPE", "EXCEPT", "EXCLUDING", 
			"EXECUTE", "EXISTS", "EXPLAIN", "EXTRACT", "FALSE", "FILTER", "FIRST", 
			"FOLLOWING", "FOR", "FORMAT", "FROM", "FULL", "FUNCTION", "FUNCTIONS", 
			"GRANT", "GRANTED", "GRANTS", "GRAPHVIZ", "GROUP", "GROUPING", "HAVING", 
			"HOUR", "IF", "IGNORE", "IN", "INCLUDING", "INNER", "INPUT", "INSERT", 
			"INTERSECT", "INTERVAL", "INTO", "IO", "IS", "ISOLATION", "JSON", "JOIN", 
			"LANGUAGE", "LAST", "LATERAL", "LEFT", "LEVEL", "LIKE", "LIMIT", "LOCALTIME", 
			"LOCALTIMESTAMP", "LOGICAL", "MAP", "MINUTE", "MONTH", "NATURAL", "NFC", 
			"NFD", "NFKC", "NFKD", "NO", "NONE", "NORMALIZE", "NOT", "NULL", "NULLIF", 
			"NULLS", "ON", "ONLY", "OPTION", "OR", "ORDER", "ORDINALITY", "OUTER", 
			"OUTPUT", "OVER", "PARTITION", "PARTITIONS", "POSITION", "PRECEDING", 
			"PREPARE", "PRIVILEGES", "PROPERTIES", "RANGE", "READ", "RECURSIVE", 
			"RENAME", "REPEATABLE", "REPLACE", "RESET", "RESPECT", "RESTRICT", "RETURN", 
			"RETURNS", "REVOKE", "RIGHT", "ROLE", "ROLES", "ROLLBACK", "ROLLUP", 
			"ROW", "ROWS", "SCHEMA", "SCHEMAS", "SECOND", "SELECT", "SERIALIZABLE", 
			"SESSION", "SET", "SETS", "SHOW", "SOME", "SQL", "START", "STATS", "SUBSTRING", 
			"SYSTEM", "TABLE", "TABLES", "TABLESAMPLE", "TEXT", "THEN", "TIME", "TIMESTAMP", 
			"TO", "TRANSACTION", "TRUE", "TRY_CAST", "TYPE", "UESCAPE", "UNBOUNDED", 
			"UNCOMMITTED", "UNION", "UNNEST", "USE", "USER", "USING", "VALIDATE", 
			"VALUES", "VERBOSE", "VIEW", "WHEN", "WHERE", "WITH", "WORK", "WRITE", 
			"YEAR", "ZONE", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", 
			"ASTERISK", "SLASH", "PERCENT", "CONCAT", "STRING", "UNICODE_STRING", 
			"BINARY_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_VALUE", "IDENTIFIER", 
			"DIGIT_IDENTIFIER", "QUOTED_IDENTIFIER", "BACKQUOTED_IDENTIFIER", "TIME_WITH_TIME_ZONE", 
			"TIMESTAMP_WITH_TIME_ZONE", "DOUBLE_PRECISION", "SIMPLE_COMMENT", "BRACKETED_COMMENT", 
			"WS", "UNRECOGNIZED", "DELIMITER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			statement();
			setState(151);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandaloneExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public StandaloneExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStandaloneExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStandaloneExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStandaloneExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneExpressionContext standaloneExpression() throws RecognitionException {
		StandaloneExpressionContext _localctx = new StandaloneExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_standaloneExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			expression();
			setState(154);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandaloneRoutineBodyContext extends ParserRuleContext {
		public RoutineBodyContext routineBody() {
			return getRuleContext(RoutineBodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public StandaloneRoutineBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneRoutineBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStandaloneRoutineBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStandaloneRoutineBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStandaloneRoutineBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneRoutineBodyContext standaloneRoutineBody() throws RecognitionException {
		StandaloneRoutineBodyContext _localctx = new StandaloneRoutineBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_standaloneRoutineBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			routineBody();
			setState(157);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode VERBOSE() { return getToken(SqlBaseParser.VERBOSE, 0); }
		public List<ExplainOptionContext> explainOption() {
			return getRuleContexts(ExplainOptionContext.class);
		}
		public ExplainOptionContext explainOption(int i) {
			return getRuleContext(ExplainOptionContext.class,i);
		}
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrepareContext extends StatementContext {
		public TerminalNode PREPARE() { return getToken(SqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public PrepareContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrepare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrepare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrepare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext schema;
		public IdentifierContext catalog;
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeallocateContext extends StatementContext {
		public TerminalNode DEALLOCATE() { return getToken(SqlBaseParser.DEALLOCATE, 0); }
		public TerminalNode PREPARE() { return getToken(SqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeallocateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeallocate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeallocate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeallocate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public QualifiedNameContext from;
		public QualifiedNameContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommitContext extends StatementContext {
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public CommitContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateRoleContext extends StatementContext {
		public IdentifierContext name;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public CreateRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateFunctionContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public ShowCreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public QualifiedNameContext column;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public DropColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCatalogsContext extends StatementContext {
		public StringContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ShowCatalogsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCatalogs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCatalogs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCatalogs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowRolesContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public ShowRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public RenameColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RevokeRolesContext extends StatementContext {
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<PrincipalContext> principal() {
			return getRuleContexts(PrincipalContext.class);
		}
		public PrincipalContext principal(int i) {
			return getRuleContext(PrincipalContext.class,i);
		}
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode GRANTED() { return getToken(SqlBaseParser.GRANTED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public RevokeRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRevokeRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRevokeRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRevokeRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowRoleGrantsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode GRANTS() { return getToken(SqlBaseParser.GRANTS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public ShowRoleGrantsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowRoleGrants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowRoleGrants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowRoleGrants(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public ColumnDefinitionContext column;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public AddColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetSessionContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ResetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public InsertIntoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSessionContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public ShowSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateSchemaContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExecuteContext extends StatementContext {
		public TerminalNode EXECUTE() { return getToken(SqlBaseParser.EXECUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExecuteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameSchemaContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RenameSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropRoleContext extends StatementContext {
		public IdentifierContext name;
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DropRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetRoleContext extends StatementContext {
		public IdentifierContext role;
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode NONE() { return getToken(SqlBaseParser.NONE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SetRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public QualifiedNameContext functionName;
		public TypeContext returnType;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode RETURNS() { return getToken(SqlBaseParser.RETURNS, 0); }
		public RoutineCharacteristicsContext routineCharacteristics() {
			return getRuleContext(RoutineCharacteristicsContext.class,0);
		}
		public RoutineBodyContext routineBody() {
			return getRuleContext(RoutineBodyContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public List<SqlParameterDeclarationContext> sqlParameterDeclaration() {
			return getRuleContexts(SqlParameterDeclarationContext.class);
		}
		public SqlParameterDeclarationContext sqlParameterDeclaration(int i) {
			return getRuleContext(SqlParameterDeclarationContext.class,i);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowGrantsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode GRANTS() { return getToken(SqlBaseParser.GRANTS, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public ShowGrantsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowGrants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowGrants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowGrants(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropSchemaContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public DropSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateViewContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StartTransactionContext extends StatementContext {
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public List<TransactionModeContext> transactionMode() {
			return getRuleContexts(TransactionModeContext.class);
		}
		public TransactionModeContext transactionMode(int i) {
			return getRuleContext(TransactionModeContext.class,i);
		}
		public StartTransactionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStartTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStartTransaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStartTransaction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableAsSelectContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public CreateTableAsSelectContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableAsSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableAsSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableAsSelect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowStatsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowStatsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowStats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowStats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowStats(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RevokeContext extends StatementContext {
		public PrincipalContext grantee;
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public RevokeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRevoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRevoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRevoke(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteContext extends StatementContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public DeleteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeInputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeInputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowStatsForQueryContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public ShowStatsForQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowStatsForQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowStatsForQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowStatsForQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterFunctionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AlterRoutineCharacteristicsContext alterRoutineCharacteristics() {
			return getRuleContext(AlterRoutineCharacteristicsContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public AlterFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetSessionContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSchemasContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public ShowSchemasContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowSchemas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowSchemas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowSchemas(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollbackContext extends StatementContext {
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public RollbackContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRollback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRollback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrantRolesContext extends StatementContext {
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PrincipalContext> principal() {
			return getRuleContexts(PrincipalContext.class);
		}
		public PrincipalContext principal(int i) {
			return getRuleContext(PrincipalContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode GRANTED() { return getToken(SqlBaseParser.GRANTED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public GrantRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGrantRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGrantRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGrantRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallContext extends StatementContext {
		public TerminalNode CALL() { return getToken(SqlBaseParser.CALL, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<CallArgumentContext> callArgument() {
			return getRuleContexts(CallArgumentContext.class);
		}
		public CallArgumentContext callArgument(int i) {
			return getRuleContext(CallArgumentContext.class,i);
		}
		public CallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeOutputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode OUTPUT() { return getToken(SqlBaseParser.OUTPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeOutputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrantContext extends StatementContext {
		public PrincipalContext grantee;
		public List<TerminalNode> GRANT() { return getTokens(SqlBaseParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(SqlBaseParser.GRANT, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public GrantContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGrant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGrant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGrant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(USE);
				setState(161);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(USE);
				setState(163);
				((UseContext)_localctx).catalog = identifier();
				setState(164);
				match(T__0);
				setState(165);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 4:
				_localctx = new CreateSchemaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(CREATE);
				setState(168);
				match(SCHEMA);
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(169);
					match(IF);
					setState(170);
					match(NOT);
					setState(171);
					match(EXISTS);
					}
					break;
				}
				setState(174);
				qualifiedName();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(175);
					match(WITH);
					setState(176);
					properties();
					}
				}

				}
				break;
			case 5:
				_localctx = new DropSchemaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				match(DROP);
				setState(180);
				match(SCHEMA);
				setState(183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(181);
					match(IF);
					setState(182);
					match(EXISTS);
					}
					break;
				}
				setState(185);
				qualifiedName();
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(186);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 6:
				_localctx = new RenameSchemaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(189);
				match(ALTER);
				setState(190);
				match(SCHEMA);
				setState(191);
				qualifiedName();
				setState(192);
				match(RENAME);
				setState(193);
				match(TO);
				setState(194);
				identifier();
				}
				break;
			case 7:
				_localctx = new CreateTableAsSelectContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(196);
				match(CREATE);
				setState(197);
				match(TABLE);
				setState(201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(198);
					match(IF);
					setState(199);
					match(NOT);
					setState(200);
					match(EXISTS);
					}
					break;
				}
				setState(203);
				qualifiedName();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(204);
					columnAliases();
					}
				}

				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(207);
					match(COMMENT);
					setState(208);
					string();
					}
				}

				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(211);
					match(WITH);
					setState(212);
					properties();
					}
				}

				setState(215);
				match(AS);
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(216);
					query();
					}
					break;
				case 2:
					{
					setState(217);
					match(T__1);
					setState(218);
					query();
					setState(219);
					match(T__2);
					}
					break;
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(223);
					match(WITH);
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(224);
						match(NO);
						}
					}

					setState(227);
					match(DATA);
					}
				}

				}
				break;
			case 8:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(230);
				match(CREATE);
				setState(231);
				match(TABLE);
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(232);
					match(IF);
					setState(233);
					match(NOT);
					setState(234);
					match(EXISTS);
					}
					break;
				}
				setState(237);
				qualifiedName();
				setState(238);
				match(T__1);
				setState(239);
				tableElement();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(240);
					match(T__3);
					setState(241);
					tableElement();
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				match(T__2);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(248);
					match(COMMENT);
					setState(249);
					string();
					}
				}

				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(252);
					match(WITH);
					setState(253);
					properties();
					}
				}

				}
				break;
			case 9:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(256);
				match(DROP);
				setState(257);
				match(TABLE);
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(258);
					match(IF);
					setState(259);
					match(EXISTS);
					}
					break;
				}
				setState(262);
				qualifiedName();
				}
				break;
			case 10:
				_localctx = new InsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(263);
				match(INSERT);
				setState(264);
				match(INTO);
				setState(265);
				qualifiedName();
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(266);
					columnAliases();
					}
					break;
				}
				setState(269);
				query();
				}
				break;
			case 11:
				_localctx = new DeleteContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(271);
				match(DELETE);
				setState(272);
				match(FROM);
				setState(273);
				qualifiedName();
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(274);
					match(WHERE);
					setState(275);
					booleanExpression(0);
					}
				}

				}
				break;
			case 12:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(278);
				match(ALTER);
				setState(279);
				match(TABLE);
				setState(280);
				((RenameTableContext)_localctx).from = qualifiedName();
				setState(281);
				match(RENAME);
				setState(282);
				match(TO);
				setState(283);
				((RenameTableContext)_localctx).to = qualifiedName();
				}
				break;
			case 13:
				_localctx = new RenameColumnContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(285);
				match(ALTER);
				setState(286);
				match(TABLE);
				setState(287);
				((RenameColumnContext)_localctx).tableName = qualifiedName();
				setState(288);
				match(RENAME);
				setState(289);
				match(COLUMN);
				setState(290);
				((RenameColumnContext)_localctx).from = identifier();
				setState(291);
				match(TO);
				setState(292);
				((RenameColumnContext)_localctx).to = identifier();
				}
				break;
			case 14:
				_localctx = new DropColumnContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(294);
				match(ALTER);
				setState(295);
				match(TABLE);
				setState(296);
				((DropColumnContext)_localctx).tableName = qualifiedName();
				setState(297);
				match(DROP);
				setState(298);
				match(COLUMN);
				setState(299);
				((DropColumnContext)_localctx).column = qualifiedName();
				}
				break;
			case 15:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(301);
				match(ALTER);
				setState(302);
				match(TABLE);
				setState(303);
				((AddColumnContext)_localctx).tableName = qualifiedName();
				setState(304);
				match(ADD);
				setState(305);
				match(COLUMN);
				setState(306);
				((AddColumnContext)_localctx).column = columnDefinition();
				}
				break;
			case 16:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(308);
				match(ANALYZE);
				setState(309);
				qualifiedName();
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(310);
					match(WITH);
					setState(311);
					properties();
					}
				}

				}
				break;
			case 17:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(314);
				match(CREATE);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(315);
					match(OR);
					setState(316);
					match(REPLACE);
					}
				}

				setState(319);
				match(VIEW);
				setState(320);
				qualifiedName();
				setState(321);
				match(AS);
				setState(322);
				query();
				}
				break;
			case 18:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(324);
				match(DROP);
				setState(325);
				match(VIEW);
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(326);
					match(IF);
					setState(327);
					match(EXISTS);
					}
					break;
				}
				setState(330);
				qualifiedName();
				}
				break;
			case 19:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(331);
				match(CREATE);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(332);
					match(OR);
					setState(333);
					match(REPLACE);
					}
				}

				setState(336);
				match(FUNCTION);
				setState(337);
				((CreateFunctionContext)_localctx).functionName = qualifiedName();
				setState(338);
				match(T__1);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXPLAIN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FORMAT - 66)) | (1L << (FUNCTION - 66)) | (1L << (FUNCTIONS - 66)) | (1L << (GRANT - 66)) | (1L << (GRANTED - 66)) | (1L << (GRANTS - 66)) | (1L << (GRAPHVIZ - 66)) | (1L << (HOUR - 66)) | (1L << (IF - 66)) | (1L << (IGNORE - 66)) | (1L << (INCLUDING - 66)) | (1L << (INPUT - 66)) | (1L << (INTERVAL - 66)) | (1L << (IO - 66)) | (1L << (ISOLATION - 66)) | (1L << (JSON - 66)) | (1L << (LANGUAGE - 66)) | (1L << (LAST - 66)) | (1L << (LATERAL - 66)) | (1L << (LEVEL - 66)) | (1L << (LIMIT - 66)) | (1L << (LOGICAL - 66)) | (1L << (MAP - 66)) | (1L << (MINUTE - 66)) | (1L << (MONTH - 66)) | (1L << (NFC - 66)) | (1L << (NFD - 66)) | (1L << (NFKC - 66)) | (1L << (NFKD - 66)) | (1L << (NO - 66)) | (1L << (NONE - 66)) | (1L << (NULLIF - 66)) | (1L << (NULLS - 66)) | (1L << (ONLY - 66)) | (1L << (OPTION - 66)) | (1L << (ORDINALITY - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (OUTPUT - 130)) | (1L << (OVER - 130)) | (1L << (PARTITION - 130)) | (1L << (PARTITIONS - 130)) | (1L << (POSITION - 130)) | (1L << (PRECEDING - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (RENAME - 130)) | (1L << (REPEATABLE - 130)) | (1L << (REPLACE - 130)) | (1L << (RESET - 130)) | (1L << (RESPECT - 130)) | (1L << (RESTRICT - 130)) | (1L << (RETURN - 130)) | (1L << (RETURNS - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROLLBACK - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCHEMA - 130)) | (1L << (SCHEMAS - 130)) | (1L << (SECOND - 130)) | (1L << (SERIALIZABLE - 130)) | (1L << (SESSION - 130)) | (1L << (SET - 130)) | (1L << (SETS - 130)) | (1L << (SHOW - 130)) | (1L << (SOME - 130)) | (1L << (SQL - 130)) | (1L << (START - 130)) | (1L << (STATS - 130)) | (1L << (SUBSTRING - 130)) | (1L << (SYSTEM - 130)) | (1L << (TABLES - 130)) | (1L << (TABLESAMPLE - 130)) | (1L << (TEXT - 130)) | (1L << (TIME - 130)) | (1L << (TIMESTAMP - 130)) | (1L << (TO - 130)) | (1L << (TRANSACTION - 130)) | (1L << (TRY_CAST - 130)) | (1L << (TYPE - 130)) | (1L << (UNBOUNDED - 130)) | (1L << (UNCOMMITTED - 130)) | (1L << (USE - 130)) | (1L << (USER - 130)) | (1L << (VALIDATE - 130)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)) | (1L << (IDENTIFIER - 195)) | (1L << (DIGIT_IDENTIFIER - 195)) | (1L << (QUOTED_IDENTIFIER - 195)) | (1L << (BACKQUOTED_IDENTIFIER - 195)))) != 0)) {
					{
					setState(339);
					sqlParameterDeclaration();
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(340);
						match(T__3);
						setState(341);
						sqlParameterDeclaration();
						}
						}
						setState(346);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(349);
				match(T__2);
				setState(350);
				match(RETURNS);
				setState(351);
				((CreateFunctionContext)_localctx).returnType = type(0);
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(352);
					match(COMMENT);
					setState(353);
					string();
					}
				}

				setState(356);
				routineCharacteristics();
				setState(357);
				routineBody();
				}
				break;
			case 20:
				_localctx = new AlterFunctionContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(359);
				match(ALTER);
				setState(360);
				match(FUNCTION);
				setState(361);
				qualifiedName();
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(362);
					types();
					}
				}

				setState(365);
				alterRoutineCharacteristics();
				}
				break;
			case 21:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(367);
				match(DROP);
				setState(368);
				match(FUNCTION);
				setState(371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(369);
					match(IF);
					setState(370);
					match(EXISTS);
					}
					break;
				}
				setState(373);
				qualifiedName();
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(374);
					types();
					}
				}

				}
				break;
			case 22:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(377);
				match(CALL);
				setState(378);
				qualifiedName();
				setState(379);
				match(T__1);
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS) | (1L << EXPLAIN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (ONLY - 64)) | (1L << (OPTION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNS - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (SQL - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (USE - 128)) | (1L << (USER - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (VALIDATE - 193)) | (1L << (VERBOSE - 193)) | (1L << (VIEW - 193)) | (1L << (WORK - 193)) | (1L << (WRITE - 193)) | (1L << (YEAR - 193)) | (1L << (ZONE - 193)) | (1L << (PLUS - 193)) | (1L << (MINUS - 193)) | (1L << (STRING - 193)) | (1L << (UNICODE_STRING - 193)) | (1L << (BINARY_LITERAL - 193)) | (1L << (INTEGER_VALUE - 193)) | (1L << (DECIMAL_VALUE - 193)) | (1L << (DOUBLE_VALUE - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (DIGIT_IDENTIFIER - 193)) | (1L << (QUOTED_IDENTIFIER - 193)) | (1L << (BACKQUOTED_IDENTIFIER - 193)) | (1L << (DOUBLE_PRECISION - 193)))) != 0)) {
					{
					setState(380);
					callArgument();
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(381);
						match(T__3);
						setState(382);
						callArgument();
						}
						}
						setState(387);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(390);
				match(T__2);
				}
				break;
			case 23:
				_localctx = new CreateRoleContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(392);
				match(CREATE);
				setState(393);
				match(ROLE);
				setState(394);
				((CreateRoleContext)_localctx).name = identifier();
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(395);
					match(WITH);
					setState(396);
					match(ADMIN);
					setState(397);
					grantor();
					}
				}

				}
				break;
			case 24:
				_localctx = new DropRoleContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(400);
				match(DROP);
				setState(401);
				match(ROLE);
				setState(402);
				((DropRoleContext)_localctx).name = identifier();
				}
				break;
			case 25:
				_localctx = new GrantRolesContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(403);
				match(GRANT);
				setState(404);
				roles();
				setState(405);
				match(TO);
				setState(406);
				principal();
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(407);
					match(T__3);
					setState(408);
					principal();
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(414);
					match(WITH);
					setState(415);
					match(ADMIN);
					setState(416);
					match(OPTION);
					}
				}

				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANTED) {
					{
					setState(419);
					match(GRANTED);
					setState(420);
					match(BY);
					setState(421);
					grantor();
					}
				}

				}
				break;
			case 26:
				_localctx = new RevokeRolesContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(424);
				match(REVOKE);
				setState(428);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(425);
					match(ADMIN);
					setState(426);
					match(OPTION);
					setState(427);
					match(FOR);
					}
					break;
				}
				setState(430);
				roles();
				setState(431);
				match(FROM);
				setState(432);
				principal();
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(433);
					match(T__3);
					setState(434);
					principal();
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANTED) {
					{
					setState(440);
					match(GRANTED);
					setState(441);
					match(BY);
					setState(442);
					grantor();
					}
				}

				}
				break;
			case 27:
				_localctx = new SetRoleContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(445);
				match(SET);
				setState(446);
				match(ROLE);
				setState(450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(447);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(448);
					match(NONE);
					}
					break;
				case 3:
					{
					setState(449);
					((SetRoleContext)_localctx).role = identifier();
					}
					break;
				}
				}
				break;
			case 28:
				_localctx = new GrantContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(452);
				match(GRANT);
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(453);
					privilege();
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(454);
						match(T__3);
						setState(455);
						privilege();
						}
						}
						setState(460);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(461);
					match(ALL);
					setState(462);
					match(PRIVILEGES);
					}
					break;
				}
				setState(465);
				match(ON);
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(466);
					match(TABLE);
					}
				}

				setState(469);
				qualifiedName();
				setState(470);
				match(TO);
				setState(471);
				((GrantContext)_localctx).grantee = principal();
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(472);
					match(WITH);
					setState(473);
					match(GRANT);
					setState(474);
					match(OPTION);
					}
				}

				}
				break;
			case 29:
				_localctx = new RevokeContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(477);
				match(REVOKE);
				setState(481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(478);
					match(GRANT);
					setState(479);
					match(OPTION);
					setState(480);
					match(FOR);
					}
					break;
				}
				setState(493);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(483);
					privilege();
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(484);
						match(T__3);
						setState(485);
						privilege();
						}
						}
						setState(490);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(491);
					match(ALL);
					setState(492);
					match(PRIVILEGES);
					}
					break;
				}
				setState(495);
				match(ON);
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(496);
					match(TABLE);
					}
				}

				setState(499);
				qualifiedName();
				setState(500);
				match(FROM);
				setState(501);
				((RevokeContext)_localctx).grantee = principal();
				}
				break;
			case 30:
				_localctx = new ShowGrantsContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(503);
				match(SHOW);
				setState(504);
				match(GRANTS);
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(505);
					match(ON);
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TABLE) {
						{
						setState(506);
						match(TABLE);
						}
					}

					setState(509);
					qualifiedName();
					}
				}

				}
				break;
			case 31:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(512);
				match(EXPLAIN);
				setState(514);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(513);
					match(ANALYZE);
					}
					break;
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VERBOSE) {
					{
					setState(516);
					match(VERBOSE);
					}
				}

				setState(530);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(519);
					match(T__1);
					setState(520);
					explainOption();
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(521);
						match(T__3);
						setState(522);
						explainOption();
						}
						}
						setState(527);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(528);
					match(T__2);
					}
					break;
				}
				setState(532);
				statement();
				}
				break;
			case 32:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(533);
				match(SHOW);
				setState(534);
				match(CREATE);
				setState(535);
				match(TABLE);
				setState(536);
				qualifiedName();
				}
				break;
			case 33:
				_localctx = new ShowCreateViewContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(537);
				match(SHOW);
				setState(538);
				match(CREATE);
				setState(539);
				match(VIEW);
				setState(540);
				qualifiedName();
				}
				break;
			case 34:
				_localctx = new ShowCreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(541);
				match(SHOW);
				setState(542);
				match(CREATE);
				setState(543);
				match(FUNCTION);
				setState(544);
				qualifiedName();
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(545);
					types();
					}
				}

				}
				break;
			case 35:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(548);
				match(SHOW);
				setState(549);
				match(TABLES);
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(550);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(551);
					qualifiedName();
					}
				}

				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(554);
					match(LIKE);
					setState(555);
					((ShowTablesContext)_localctx).pattern = string();
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(556);
						match(ESCAPE);
						setState(557);
						((ShowTablesContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 36:
				_localctx = new ShowSchemasContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(562);
				match(SHOW);
				setState(563);
				match(SCHEMAS);
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(564);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(565);
					identifier();
					}
				}

				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(568);
					match(LIKE);
					setState(569);
					((ShowSchemasContext)_localctx).pattern = string();
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(570);
						match(ESCAPE);
						setState(571);
						((ShowSchemasContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 37:
				_localctx = new ShowCatalogsContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(576);
				match(SHOW);
				setState(577);
				match(CATALOGS);
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(578);
					match(LIKE);
					setState(579);
					((ShowCatalogsContext)_localctx).pattern = string();
					}
				}

				}
				break;
			case 38:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(582);
				match(SHOW);
				setState(583);
				match(COLUMNS);
				setState(584);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(585);
				qualifiedName();
				}
				break;
			case 39:
				_localctx = new ShowStatsContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(586);
				match(SHOW);
				setState(587);
				match(STATS);
				setState(588);
				match(FOR);
				setState(589);
				qualifiedName();
				}
				break;
			case 40:
				_localctx = new ShowStatsForQueryContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(590);
				match(SHOW);
				setState(591);
				match(STATS);
				setState(592);
				match(FOR);
				setState(593);
				match(T__1);
				setState(594);
				querySpecification();
				setState(595);
				match(T__2);
				}
				break;
			case 41:
				_localctx = new ShowRolesContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(597);
				match(SHOW);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CURRENT) {
					{
					setState(598);
					match(CURRENT);
					}
				}

				setState(601);
				match(ROLES);
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(602);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(603);
					identifier();
					}
				}

				}
				break;
			case 42:
				_localctx = new ShowRoleGrantsContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(606);
				match(SHOW);
				setState(607);
				match(ROLE);
				setState(608);
				match(GRANTS);
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(609);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(610);
					identifier();
					}
				}

				}
				break;
			case 43:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(613);
				match(DESCRIBE);
				setState(614);
				qualifiedName();
				}
				break;
			case 44:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(615);
				match(DESC);
				setState(616);
				qualifiedName();
				}
				break;
			case 45:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(617);
				match(SHOW);
				setState(618);
				match(FUNCTIONS);
				}
				break;
			case 46:
				_localctx = new ShowSessionContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(619);
				match(SHOW);
				setState(620);
				match(SESSION);
				}
				break;
			case 47:
				_localctx = new SetSessionContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(621);
				match(SET);
				setState(622);
				match(SESSION);
				setState(623);
				qualifiedName();
				setState(624);
				match(EQ);
				setState(625);
				expression();
				}
				break;
			case 48:
				_localctx = new ResetSessionContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(627);
				match(RESET);
				setState(628);
				match(SESSION);
				setState(629);
				qualifiedName();
				}
				break;
			case 49:
				_localctx = new StartTransactionContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(630);
				match(START);
				setState(631);
				match(TRANSACTION);
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ISOLATION || _la==READ) {
					{
					setState(632);
					transactionMode();
					setState(637);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(633);
						match(T__3);
						setState(634);
						transactionMode();
						}
						}
						setState(639);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 50:
				_localctx = new CommitContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(642);
				match(COMMIT);
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(643);
					match(WORK);
					}
				}

				}
				break;
			case 51:
				_localctx = new RollbackContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(646);
				match(ROLLBACK);
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(647);
					match(WORK);
					}
				}

				}
				break;
			case 52:
				_localctx = new PrepareContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(650);
				match(PREPARE);
				setState(651);
				identifier();
				setState(652);
				match(FROM);
				setState(653);
				statement();
				}
				break;
			case 53:
				_localctx = new DeallocateContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(655);
				match(DEALLOCATE);
				setState(656);
				match(PREPARE);
				setState(657);
				identifier();
				}
				break;
			case 54:
				_localctx = new ExecuteContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(658);
				match(EXECUTE);
				setState(659);
				identifier();
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(660);
					match(USING);
					setState(661);
					expression();
					setState(666);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(662);
						match(T__3);
						setState(663);
						expression();
						}
						}
						setState(668);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 55:
				_localctx = new DescribeInputContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(671);
				match(DESCRIBE);
				setState(672);
				match(INPUT);
				setState(673);
				identifier();
				}
				break;
			case 56:
				_localctx = new DescribeOutputContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(674);
				match(DESCRIBE);
				setState(675);
				match(OUTPUT);
				setState(676);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(679);
				with();
				}
			}

			setState(682);
			queryNoWith();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public TerminalNode RECURSIVE() { return getToken(SqlBaseParser.RECURSIVE, 0); }
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(WITH);
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(685);
				match(RECURSIVE);
				}
			}

			setState(688);
			namedQuery();
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(689);
				match(T__3);
				setState(690);
				namedQuery();
				}
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableElementContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public LikeClauseContext likeClause() {
			return getRuleContext(LikeClauseContext.class,0);
		}
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableElement);
		try {
			setState(698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				columnDefinition();
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				likeClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			identifier();
			setState(701);
			type(0);
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(702);
				match(NOT);
				setState(703);
				match(NULL);
				}
			}

			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(706);
				match(COMMENT);
				setState(707);
				string();
				}
			}

			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(710);
				match(WITH);
				setState(711);
				properties();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LikeClauseContext extends ParserRuleContext {
		public Token optionType;
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode INCLUDING() { return getToken(SqlBaseParser.INCLUDING, 0); }
		public TerminalNode EXCLUDING() { return getToken(SqlBaseParser.EXCLUDING, 0); }
		public LikeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLikeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLikeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLikeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeClauseContext likeClause() throws RecognitionException {
		LikeClauseContext _localctx = new LikeClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_likeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(LIKE);
			setState(715);
			qualifiedName();
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUDING || _la==INCLUDING) {
				{
				setState(716);
				((LikeClauseContext)_localctx).optionType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EXCLUDING || _la==INCLUDING) ) {
					((LikeClauseContext)_localctx).optionType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(717);
				match(PROPERTIES);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertiesContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(T__1);
			setState(721);
			property();
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(722);
				match(T__3);
				setState(723);
				property();
				}
				}
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(729);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			identifier();
			setState(732);
			match(EQ);
			setState(733);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlParameterDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SqlParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlParameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSqlParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSqlParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSqlParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlParameterDeclarationContext sqlParameterDeclaration() throws RecognitionException {
		SqlParameterDeclarationContext _localctx = new SqlParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sqlParameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			identifier();
			setState(736);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoutineCharacteristicsContext extends ParserRuleContext {
		public List<RoutineCharacteristicContext> routineCharacteristic() {
			return getRuleContexts(RoutineCharacteristicContext.class);
		}
		public RoutineCharacteristicContext routineCharacteristic(int i) {
			return getRuleContext(RoutineCharacteristicContext.class,i);
		}
		public RoutineCharacteristicsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineCharacteristics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRoutineCharacteristics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRoutineCharacteristics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRoutineCharacteristics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineCharacteristicsContext routineCharacteristics() throws RecognitionException {
		RoutineCharacteristicsContext _localctx = new RoutineCharacteristicsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_routineCharacteristics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CALLED || _la==DETERMINISTIC || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (LANGUAGE - 98)) | (1L << (NOT - 98)) | (1L << (RETURNS - 98)))) != 0)) {
				{
				{
				setState(738);
				routineCharacteristic();
				}
				}
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoutineCharacteristicContext extends ParserRuleContext {
		public TerminalNode LANGUAGE() { return getToken(SqlBaseParser.LANGUAGE, 0); }
		public LanguageContext language() {
			return getRuleContext(LanguageContext.class,0);
		}
		public DeterminismContext determinism() {
			return getRuleContext(DeterminismContext.class,0);
		}
		public NullCallClauseContext nullCallClause() {
			return getRuleContext(NullCallClauseContext.class,0);
		}
		public RoutineCharacteristicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineCharacteristic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRoutineCharacteristic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRoutineCharacteristic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRoutineCharacteristic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineCharacteristicContext routineCharacteristic() throws RecognitionException {
		RoutineCharacteristicContext _localctx = new RoutineCharacteristicContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_routineCharacteristic);
		try {
			setState(748);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				match(LANGUAGE);
				setState(745);
				language();
				}
				break;
			case DETERMINISTIC:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				determinism();
				}
				break;
			case CALLED:
			case RETURNS:
				enterOuterAlt(_localctx, 3);
				{
				setState(747);
				nullCallClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterRoutineCharacteristicsContext extends ParserRuleContext {
		public List<AlterRoutineCharacteristicContext> alterRoutineCharacteristic() {
			return getRuleContexts(AlterRoutineCharacteristicContext.class);
		}
		public AlterRoutineCharacteristicContext alterRoutineCharacteristic(int i) {
			return getRuleContext(AlterRoutineCharacteristicContext.class,i);
		}
		public AlterRoutineCharacteristicsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRoutineCharacteristics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterRoutineCharacteristics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterRoutineCharacteristics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterRoutineCharacteristics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterRoutineCharacteristicsContext alterRoutineCharacteristics() throws RecognitionException {
		AlterRoutineCharacteristicsContext _localctx = new AlterRoutineCharacteristicsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alterRoutineCharacteristics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CALLED || _la==RETURNS) {
				{
				{
				setState(750);
				alterRoutineCharacteristic();
				}
				}
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterRoutineCharacteristicContext extends ParserRuleContext {
		public NullCallClauseContext nullCallClause() {
			return getRuleContext(NullCallClauseContext.class,0);
		}
		public AlterRoutineCharacteristicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRoutineCharacteristic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterRoutineCharacteristic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterRoutineCharacteristic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterRoutineCharacteristic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterRoutineCharacteristicContext alterRoutineCharacteristic() throws RecognitionException {
		AlterRoutineCharacteristicContext _localctx = new AlterRoutineCharacteristicContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_alterRoutineCharacteristic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			nullCallClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoutineBodyContext extends ParserRuleContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public RoutineBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRoutineBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRoutineBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRoutineBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineBodyContext routineBody() throws RecognitionException {
		RoutineBodyContext _localctx = new RoutineBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_routineBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			returnStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SqlBaseParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			match(RETURN);
			setState(761);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LanguageContext extends ParserRuleContext {
		public TerminalNode SQL() { return getToken(SqlBaseParser.SQL, 0); }
		public LanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLanguage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLanguage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLanguage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguageContext language() throws RecognitionException {
		LanguageContext _localctx = new LanguageContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_language);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(SQL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeterminismContext extends ParserRuleContext {
		public TerminalNode DETERMINISTIC() { return getToken(SqlBaseParser.DETERMINISTIC, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public DeterminismContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_determinism; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeterminism(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeterminism(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeterminism(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeterminismContext determinism() throws RecognitionException {
		DeterminismContext _localctx = new DeterminismContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_determinism);
		try {
			setState(768);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DETERMINISTIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				match(DETERMINISTIC);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				match(NOT);
				setState(767);
				match(DETERMINISTIC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullCallClauseContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(SqlBaseParser.RETURNS, 0); }
		public List<TerminalNode> NULL() { return getTokens(SqlBaseParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(SqlBaseParser.NULL, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public TerminalNode CALLED() { return getToken(SqlBaseParser.CALLED, 0); }
		public NullCallClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullCallClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullCallClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullCallClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullCallClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullCallClauseContext nullCallClause() throws RecognitionException {
		NullCallClauseContext _localctx = new NullCallClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nullCallClause);
		try {
			setState(779);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURNS:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				match(RETURNS);
				setState(771);
				match(NULL);
				setState(772);
				match(ON);
				setState(773);
				match(NULL);
				setState(774);
				match(INPUT);
				}
				break;
			case CALLED:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
				match(CALLED);
				setState(776);
				match(ON);
				setState(777);
				match(NULL);
				setState(778);
				match(INPUT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryNoWithContext extends ParserRuleContext {
		public Token limit;
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryNoWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryNoWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryNoWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_queryNoWith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			queryTerm(0);
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(782);
				match(ORDER);
				setState(783);
				match(BY);
				setState(784);
				sortItem();
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(785);
					match(T__3);
					setState(786);
					sortItem();
					}
					}
					setState(791);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(794);
				match(LIMIT);
				setState(795);
				((QueryNoWithContext)_localctx).limit = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==INTEGER_VALUE) ) {
					((QueryNoWithContext)_localctx).limit = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(799);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(815);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(813);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(801);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(802);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(804);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(803);
							setQuantifier();
							}
						}

						setState(806);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(807);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(808);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(810);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(809);
							setQuantifier();
							}
						}

						setState(812);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(817);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableContext extends QueryPrimaryContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InlineTableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_queryPrimary);
		try {
			int _alt;
			setState(834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(819);
				match(TABLE);
				setState(820);
				qualifiedName();
				}
				break;
			case VALUES:
				_localctx = new InlineTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(821);
				match(VALUES);
				setState(822);
				expression();
				setState(827);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(823);
						match(T__3);
						setState(824);
						expression();
						}
						} 
					}
					setState(829);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(830);
				match(T__1);
				setState(831);
				queryNoWith();
				setState(832);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrdering;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			expression();
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(837);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(840);
				match(NULLS);
				setState(841);
				((SortItemContext)_localctx).nullOrdering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrdering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public BooleanExpressionContext where;
		public BooleanExpressionContext having;
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public GroupByContext groupBy() {
			return getRuleContext(GroupByContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_querySpecification);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(SELECT);
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(845);
				setQuantifier();
				}
				break;
			}
			setState(848);
			selectItem();
			setState(853);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(849);
					match(T__3);
					setState(850);
					selectItem();
					}
					} 
				}
				setState(855);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			setState(865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(856);
				match(FROM);
				setState(857);
				relation(0);
				setState(862);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(858);
						match(T__3);
						setState(859);
						relation(0);
						}
						} 
					}
					setState(864);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				}
				break;
			}
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(867);
				match(WHERE);
				setState(868);
				((QuerySpecificationContext)_localctx).where = booleanExpression(0);
				}
				break;
			}
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(871);
				match(GROUP);
				setState(872);
				match(BY);
				setState(873);
				groupBy();
				}
				break;
			}
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(876);
				match(HAVING);
				setState(877);
				((QuerySpecificationContext)_localctx).having = booleanExpression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByContext extends ParserRuleContext {
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public GroupByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByContext groupBy() throws RecognitionException {
		GroupByContext _localctx = new GroupByContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_groupBy);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(880);
				setQuantifier();
				}
				break;
			}
			setState(883);
			groupingElement();
			setState(888);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(884);
					match(T__3);
					setState(885);
					groupingElement();
					}
					} 
				}
				setState(890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
	 
		public GroupingElementContext() { }
		public void copyFrom(GroupingElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleGroupingSetsContext extends GroupingElementContext {
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public MultipleGroupingSetsContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipleGroupingSets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipleGroupingSets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipleGroupingSets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleGroupingSetContext extends GroupingElementContext {
		public GroupingSetContext groupingSet() {
			return getRuleContext(GroupingSetContext.class,0);
		}
		public SingleGroupingSetContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CubeContext extends GroupingElementContext {
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CubeContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCube(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCube(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCube(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollupContext extends GroupingElementContext {
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RollupContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRollup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRollup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRollup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_groupingElement);
		int _la;
		try {
			setState(931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				_localctx = new SingleGroupingSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				groupingSet();
				}
				break;
			case 2:
				_localctx = new RollupContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				match(ROLLUP);
				setState(893);
				match(T__1);
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS) | (1L << EXPLAIN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (ONLY - 64)) | (1L << (OPTION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNS - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (SQL - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (USE - 128)) | (1L << (USER - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (VALIDATE - 193)) | (1L << (VERBOSE - 193)) | (1L << (VIEW - 193)) | (1L << (WORK - 193)) | (1L << (WRITE - 193)) | (1L << (YEAR - 193)) | (1L << (ZONE - 193)) | (1L << (PLUS - 193)) | (1L << (MINUS - 193)) | (1L << (STRING - 193)) | (1L << (UNICODE_STRING - 193)) | (1L << (BINARY_LITERAL - 193)) | (1L << (INTEGER_VALUE - 193)) | (1L << (DECIMAL_VALUE - 193)) | (1L << (DOUBLE_VALUE - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (DIGIT_IDENTIFIER - 193)) | (1L << (QUOTED_IDENTIFIER - 193)) | (1L << (BACKQUOTED_IDENTIFIER - 193)) | (1L << (DOUBLE_PRECISION - 193)))) != 0)) {
					{
					setState(894);
					expression();
					setState(899);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(895);
						match(T__3);
						setState(896);
						expression();
						}
						}
						setState(901);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(904);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new CubeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(905);
				match(CUBE);
				setState(906);
				match(T__1);
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS) | (1L << EXPLAIN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (ONLY - 64)) | (1L << (OPTION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNS - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (SQL - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (USE - 128)) | (1L << (USER - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (VALIDATE - 193)) | (1L << (VERBOSE - 193)) | (1L << (VIEW - 193)) | (1L << (WORK - 193)) | (1L << (WRITE - 193)) | (1L << (YEAR - 193)) | (1L << (ZONE - 193)) | (1L << (PLUS - 193)) | (1L << (MINUS - 193)) | (1L << (STRING - 193)) | (1L << (UNICODE_STRING - 193)) | (1L << (BINARY_LITERAL - 193)) | (1L << (INTEGER_VALUE - 193)) | (1L << (DECIMAL_VALUE - 193)) | (1L << (DOUBLE_VALUE - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (DIGIT_IDENTIFIER - 193)) | (1L << (QUOTED_IDENTIFIER - 193)) | (1L << (BACKQUOTED_IDENTIFIER - 193)) | (1L << (DOUBLE_PRECISION - 193)))) != 0)) {
					{
					setState(907);
					expression();
					setState(912);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(908);
						match(T__3);
						setState(909);
						expression();
						}
						}
						setState(914);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(917);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new MultipleGroupingSetsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(918);
				match(GROUPING);
				setState(919);
				match(SETS);
				setState(920);
				match(T__1);
				setState(921);
				groupingSet();
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(922);
					match(T__3);
					setState(923);
					groupingSet();
					}
					}
					setState(928);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(929);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_groupingSet);
		int _la;
		try {
			setState(946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(933);
				match(T__1);
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS) | (1L << EXPLAIN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (ONLY - 64)) | (1L << (OPTION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNS - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (SQL - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (USE - 128)) | (1L << (USER - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (VALIDATE - 193)) | (1L << (VERBOSE - 193)) | (1L << (VIEW - 193)) | (1L << (WORK - 193)) | (1L << (WRITE - 193)) | (1L << (YEAR - 193)) | (1L << (ZONE - 193)) | (1L << (PLUS - 193)) | (1L << (MINUS - 193)) | (1L << (STRING - 193)) | (1L << (UNICODE_STRING - 193)) | (1L << (BINARY_LITERAL - 193)) | (1L << (INTEGER_VALUE - 193)) | (1L << (DECIMAL_VALUE - 193)) | (1L << (DOUBLE_VALUE - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (DIGIT_IDENTIFIER - 193)) | (1L << (QUOTED_IDENTIFIER - 193)) | (1L << (BACKQUOTED_IDENTIFIER - 193)) | (1L << (DOUBLE_PRECISION - 193)))) != 0)) {
					{
					setState(934);
					expression();
					setState(939);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(935);
						match(T__3);
						setState(936);
						expression();
						}
						}
						setState(941);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(944);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(945);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			((NamedQueryContext)_localctx).name = identifier();
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(949);
				columnAliases();
				}
			}

			setState(952);
			match(AS);
			setState(953);
			match(T__1);
			setState(954);
			query();
			setState(955);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemContext extends ParserRuleContext {
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	 
		public SelectItemContext() { }
		public void copyFrom(SelectItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectAllContext extends SelectItemContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public SelectAllContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectSingleContext extends SelectItemContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public SelectSingleContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selectItem);
		int _la;
		try {
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				_localctx = new SelectSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				expression();
				setState(964);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(961);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(960);
						match(AS);
						}
					}

					setState(963);
					identifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(966);
				qualifiedName();
				setState(967);
				match(T__0);
				setState(968);
				match(ASTERISK);
				}
				break;
			case 3:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(970);
				match(ASTERISK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationDefaultContext extends RelationContext {
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public RelationDefaultContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelationDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelationDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelationDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinRelationContext extends RelationContext {
		public RelationContext left;
		public SampledRelationContext right;
		public RelationContext rightRelation;
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public JoinRelationContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		return relation(0);
	}

	private RelationContext relation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationContext _localctx = new RelationContext(_ctx, _parentState);
		RelationContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(974);
			sampledRelation();
			}
			_ctx.stop = _input.LT(-1);
			setState(994);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinRelationContext(new RelationContext(_parentctx, _parentState));
					((JoinRelationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_relation);
					setState(976);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(990);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CROSS:
						{
						setState(977);
						match(CROSS);
						setState(978);
						match(JOIN);
						setState(979);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					case FULL:
					case INNER:
					case JOIN:
					case LEFT:
					case RIGHT:
						{
						setState(980);
						joinType();
						setState(981);
						match(JOIN);
						setState(982);
						((JoinRelationContext)_localctx).rightRelation = relation(0);
						setState(983);
						joinCriteria();
						}
						break;
					case NATURAL:
						{
						setState(985);
						match(NATURAL);
						setState(986);
						joinType();
						setState(987);
						match(JOIN);
						setState(988);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(996);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_joinType);
		int _la;
		try {
			setState(1012);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
			case JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(997);
					match(INNER);
					}
				}

				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1000);
				match(LEFT);
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1001);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1004);
				match(RIGHT);
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1005);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1008);
				match(FULL);
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1009);
					match(OUTER);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_joinCriteria);
		int _la;
		try {
			setState(1028);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1014);
				match(ON);
				setState(1015);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1016);
				match(USING);
				setState(1017);
				match(T__1);
				setState(1018);
				identifier();
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1019);
					match(T__3);
					setState(1020);
					identifier();
					}
					}
					setState(1025);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1026);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampledRelationContext extends ParserRuleContext {
		public ExpressionContext percentage;
		public AliasedRelationContext aliasedRelation() {
			return getRuleContext(AliasedRelationContext.class,0);
		}
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public SampleTypeContext sampleType() {
			return getRuleContext(SampleTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampledRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampledRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampledRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampledRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampledRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampledRelationContext sampledRelation() throws RecognitionException {
		SampledRelationContext _localctx = new SampledRelationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sampledRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			aliasedRelation();
			setState(1037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1031);
				match(TABLESAMPLE);
				setState(1032);
				sampleType();
				setState(1033);
				match(T__1);
				setState(1034);
				((SampledRelationContext)_localctx).percentage = expression();
				setState(1035);
				match(T__2);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleTypeContext extends ParserRuleContext {
		public TerminalNode BERNOULLI() { return getToken(SqlBaseParser.BERNOULLI, 0); }
		public TerminalNode SYSTEM() { return getToken(SqlBaseParser.SYSTEM, 0); }
		public SampleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleTypeContext sampleType() throws RecognitionException {
		SampleTypeContext _localctx = new SampleTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_sampleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			_la = _input.LA(1);
			if ( !(_la==BERNOULLI || _la==SYSTEM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasedRelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public AliasedRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasedRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasedRelationContext aliasedRelation() throws RecognitionException {
		AliasedRelationContext _localctx = new AliasedRelationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_aliasedRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			relationPrimary();
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1042);
					match(AS);
					}
				}

				setState(1045);
				identifier();
				setState(1047);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1046);
					columnAliases();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnAliasesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ColumnAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnAliases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasesContext columnAliases() throws RecognitionException {
		ColumnAliasesContext _localctx = new ColumnAliasesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_columnAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			match(T__1);
			setState(1052);
			identifier();
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1053);
				match(T__3);
				setState(1054);
				identifier();
				}
				}
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1060);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryRelationContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public ParenthesizedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnestContext extends RelationPrimaryContext {
		public TerminalNode UNNEST() { return getToken(SqlBaseParser.UNNEST, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ORDINALITY() { return getToken(SqlBaseParser.ORDINALITY, 0); }
		public UnnestContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnnest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnnest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnnest(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LateralContext extends RelationPrimaryContext {
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public LateralContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLateral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLateral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLateral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_relationPrimary);
		int _la;
		try {
			setState(1091);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1062);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new SubqueryRelationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
				match(T__1);
				setState(1064);
				query();
				setState(1065);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new UnnestContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1067);
				match(UNNEST);
				setState(1068);
				match(T__1);
				setState(1069);
				expression();
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1070);
					match(T__3);
					setState(1071);
					expression();
					}
					}
					setState(1076);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1077);
				match(T__2);
				setState(1080);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1078);
					match(WITH);
					setState(1079);
					match(ORDINALITY);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new LateralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1082);
				match(LATERAL);
				setState(1083);
				match(T__1);
				setState(1084);
				query();
				setState(1085);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new ParenthesizedRelationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1087);
				match(T__1);
				setState(1088);
				relation(0);
				setState(1089);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CASE:
			case CAST:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_ROLE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXISTS:
			case EXPLAIN:
			case EXTRACT:
			case FALSE:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPING:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NORMALIZE:
			case NULL:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRUE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case PLUS:
			case MINUS:
			case STRING:
			case UNICODE_STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case DOUBLE_PRECISION:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1096);
				((PredicatedContext)_localctx).valueExpression = valueExpression(0);
				setState(1098);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1097);
					predicate(((PredicatedContext)_localctx).valueExpression);
					}
					break;
				}
				}
				break;
			case NOT:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1100);
				match(NOT);
				setState(1101);
				booleanExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1104);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1105);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1106);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1107);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1108);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1109);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public ParserRuleContext value;
		public PredicateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PredicateContext(ParserRuleContext parent, int invokingState, ParserRuleContext value) {
			super(parent, invokingState);
			this.value = value;
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ComparisonContext extends PredicateContext {
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeContext extends PredicateContext {
		public ValueExpressionContext pattern;
		public ValueExpressionContext escape;
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public LikeContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InSubqueryContext extends PredicateContext {
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public InSubqueryContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DistinctFromContext extends PredicateContext {
		public ValueExpressionContext right;
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public DistinctFromContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDistinctFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDistinctFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDistinctFrom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InListContext extends PredicateContext {
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public InListContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullPredicateContext extends PredicateContext {
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public NullPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenContext extends PredicateContext {
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BetweenContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuantifiedComparisonContext extends PredicateContext {
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonQuantifierContext comparisonQuantifier() {
			return getRuleContext(ComparisonQuantifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QuantifiedComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuantifiedComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuantifiedComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuantifiedComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate(ParserRuleContext value) throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState(), value);
		enterRule(_localctx, 84, RULE_predicate);
		int _la;
		try {
			setState(1176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1115);
				comparisonOperator();
				setState(1116);
				((ComparisonContext)_localctx).right = valueExpression(0);
				}
				break;
			case 2:
				_localctx = new QuantifiedComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1118);
				comparisonOperator();
				setState(1119);
				comparisonQuantifier();
				setState(1120);
				match(T__1);
				setState(1121);
				query();
				setState(1122);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new BetweenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1124);
					match(NOT);
					}
				}

				setState(1127);
				match(BETWEEN);
				setState(1128);
				((BetweenContext)_localctx).lower = valueExpression(0);
				setState(1129);
				match(AND);
				setState(1130);
				((BetweenContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 4:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1132);
					match(NOT);
					}
				}

				setState(1135);
				match(IN);
				setState(1136);
				match(T__1);
				setState(1137);
				expression();
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1138);
					match(T__3);
					setState(1139);
					expression();
					}
					}
					setState(1144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1145);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new InSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1147);
					match(NOT);
					}
				}

				setState(1150);
				match(IN);
				setState(1151);
				match(T__1);
				setState(1152);
				query();
				setState(1153);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1155);
					match(NOT);
					}
				}

				setState(1158);
				match(LIKE);
				setState(1159);
				((LikeContext)_localctx).pattern = valueExpression(0);
				setState(1162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1160);
					match(ESCAPE);
					setState(1161);
					((LikeContext)_localctx).escape = valueExpression(0);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new NullPredicateContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1164);
				match(IS);
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1165);
					match(NOT);
					}
				}

				setState(1168);
				match(NULL);
				}
				break;
			case 8:
				_localctx = new DistinctFromContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1169);
				match(IS);
				setState(1171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1170);
					match(NOT);
					}
				}

				setState(1173);
				match(DISTINCT);
				setState(1174);
				match(FROM);
				setState(1175);
				((DistinctFromContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatenationContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public TerminalNode CONCAT() { return getToken(SqlBaseParser.CONCAT, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ConcatenationContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConcatenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtTimeZoneContext extends ValueExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TimeZoneSpecifierContext timeZoneSpecifier() {
			return getRuleContext(TimeZoneSpecifierContext.class,0);
		}
		public AtTimeZoneContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAtTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAtTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAtTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CASE:
			case CAST:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_ROLE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXISTS:
			case EXPLAIN:
			case EXTRACT:
			case FALSE:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPING:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NORMALIZE:
			case NULL:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRUE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case STRING:
			case UNICODE_STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case DOUBLE_PRECISION:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1179);
				primaryExpression(0);
				}
				break;
			case PLUS:
			case MINUS:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1180);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1181);
				valueExpression(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1184);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1185);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 212)) & ~0x3f) == 0 && ((1L << (_la - 212)) & ((1L << (ASTERISK - 212)) | (1L << (SLASH - 212)) | (1L << (PERCENT - 212)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1186);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1187);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1188);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1189);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new ConcatenationContext(new ValueExpressionContext(_parentctx, _parentState));
						((ConcatenationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1190);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1191);
						match(CONCAT);
						setState(1192);
						((ConcatenationContext)_localctx).right = valueExpression(2);
						}
						break;
					case 4:
						{
						_localctx = new AtTimeZoneContext(new ValueExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1193);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1194);
						match(AT);
						setState(1195);
						timeZoneSpecifier();
						}
						break;
					}
					} 
				}
				setState(1200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode DOUBLE_PRECISION() { return getToken(SqlBaseParser.DOUBLE_PRECISION, 0); }
		public TypeConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialDateTimeFunctionContext extends PrimaryExpressionContext {
		public Token name;
		public Token precision;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(SqlBaseParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SqlBaseParser.LOCALTIMESTAMP, 0); }
		public SpecialDateTimeFunctionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSpecialDateTimeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSpecialDateTimeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSpecialDateTimeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParameterContext extends PrimaryExpressionContext {
		public ParameterContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalizeContext extends PrimaryExpressionContext {
		public TerminalNode NORMALIZE() { return getToken(SqlBaseParser.NORMALIZE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public NormalFormContext normalForm() {
			return getRuleContext(NormalFormContext.class,0);
		}
		public NormalizeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNormalize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNormalize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNormalize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends PrimaryExpressionContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends PrimaryExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends PrimaryExpressionContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralContext extends PrimaryExpressionContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryLiteralContext extends PrimaryExpressionContext {
		public TerminalNode BINARY_LITERAL() { return getToken(SqlBaseParser.BINARY_LITERAL, 0); }
		public BinaryLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBinaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBinaryLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBinaryLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentUserContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public CurrentUserContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentUser(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends PrimaryExpressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayConstructorContext extends PrimaryExpressionContext {
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArrayConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArrayConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public OverContext over() {
			return getRuleContext(OverContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public NullTreatmentContext nullTreatment() {
			return getRuleContext(NullTreatmentContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends PrimaryExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupingOperationContext extends PrimaryExpressionContext {
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public GroupingOperationContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1202);
				match(NULL);
				}
				break;
			case 2:
				{
				_localctx = new IntervalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1203);
				interval();
				}
				break;
			case 3:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1204);
				identifier();
				setState(1205);
				string();
				}
				break;
			case 4:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1207);
				match(DOUBLE_PRECISION);
				setState(1208);
				string();
				}
				break;
			case 5:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1209);
				number();
				}
				break;
			case 6:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1210);
				booleanValue();
				}
				break;
			case 7:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1211);
				string();
				}
				break;
			case 8:
				{
				_localctx = new BinaryLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1212);
				match(BINARY_LITERAL);
				}
				break;
			case 9:
				{
				_localctx = new ParameterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1213);
				match(T__4);
				}
				break;
			case 10:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1214);
				match(POSITION);
				setState(1215);
				match(T__1);
				setState(1216);
				valueExpression(0);
				setState(1217);
				match(IN);
				setState(1218);
				valueExpression(0);
				setState(1219);
				match(T__2);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1221);
				match(T__1);
				setState(1222);
				expression();
				setState(1225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1223);
					match(T__3);
					setState(1224);
					expression();
					}
					}
					setState(1227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(1229);
				match(T__2);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1231);
				match(ROW);
				setState(1232);
				match(T__1);
				setState(1233);
				expression();
				setState(1238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1234);
					match(T__3);
					setState(1235);
					expression();
					}
					}
					setState(1240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1241);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1243);
				qualifiedName();
				setState(1244);
				match(T__1);
				setState(1245);
				match(ASTERISK);
				setState(1246);
				match(T__2);
				setState(1248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1247);
					filter();
					}
					break;
				}
				setState(1251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1250);
					over();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1253);
				qualifiedName();
				setState(1254);
				match(T__1);
				setState(1266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS) | (1L << EXPLAIN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (ONLY - 64)) | (1L << (OPTION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNS - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (SQL - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (USE - 128)) | (1L << (USER - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (VALIDATE - 193)) | (1L << (VERBOSE - 193)) | (1L << (VIEW - 193)) | (1L << (WORK - 193)) | (1L << (WRITE - 193)) | (1L << (YEAR - 193)) | (1L << (ZONE - 193)) | (1L << (PLUS - 193)) | (1L << (MINUS - 193)) | (1L << (STRING - 193)) | (1L << (UNICODE_STRING - 193)) | (1L << (BINARY_LITERAL - 193)) | (1L << (INTEGER_VALUE - 193)) | (1L << (DECIMAL_VALUE - 193)) | (1L << (DOUBLE_VALUE - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (DIGIT_IDENTIFIER - 193)) | (1L << (QUOTED_IDENTIFIER - 193)) | (1L << (BACKQUOTED_IDENTIFIER - 193)) | (1L << (DOUBLE_PRECISION - 193)))) != 0)) {
					{
					setState(1256);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
					case 1:
						{
						setState(1255);
						setQuantifier();
						}
						break;
					}
					setState(1258);
					expression();
					setState(1263);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1259);
						match(T__3);
						setState(1260);
						expression();
						}
						}
						setState(1265);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1268);
					match(ORDER);
					setState(1269);
					match(BY);
					setState(1270);
					sortItem();
					setState(1275);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1271);
						match(T__3);
						setState(1272);
						sortItem();
						}
						}
						setState(1277);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1280);
				match(T__2);
				setState(1282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1281);
					filter();
					}
					break;
				}
				setState(1288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1285);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IGNORE || _la==RESPECT) {
						{
						setState(1284);
						nullTreatment();
						}
					}

					setState(1287);
					over();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1290);
				identifier();
				setState(1291);
				match(T__5);
				setState(1292);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1294);
				match(T__1);
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXPLAIN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FORMAT - 66)) | (1L << (FUNCTION - 66)) | (1L << (FUNCTIONS - 66)) | (1L << (GRANT - 66)) | (1L << (GRANTED - 66)) | (1L << (GRANTS - 66)) | (1L << (GRAPHVIZ - 66)) | (1L << (HOUR - 66)) | (1L << (IF - 66)) | (1L << (IGNORE - 66)) | (1L << (INCLUDING - 66)) | (1L << (INPUT - 66)) | (1L << (INTERVAL - 66)) | (1L << (IO - 66)) | (1L << (ISOLATION - 66)) | (1L << (JSON - 66)) | (1L << (LANGUAGE - 66)) | (1L << (LAST - 66)) | (1L << (LATERAL - 66)) | (1L << (LEVEL - 66)) | (1L << (LIMIT - 66)) | (1L << (LOGICAL - 66)) | (1L << (MAP - 66)) | (1L << (MINUTE - 66)) | (1L << (MONTH - 66)) | (1L << (NFC - 66)) | (1L << (NFD - 66)) | (1L << (NFKC - 66)) | (1L << (NFKD - 66)) | (1L << (NO - 66)) | (1L << (NONE - 66)) | (1L << (NULLIF - 66)) | (1L << (NULLS - 66)) | (1L << (ONLY - 66)) | (1L << (OPTION - 66)) | (1L << (ORDINALITY - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (OUTPUT - 130)) | (1L << (OVER - 130)) | (1L << (PARTITION - 130)) | (1L << (PARTITIONS - 130)) | (1L << (POSITION - 130)) | (1L << (PRECEDING - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (RENAME - 130)) | (1L << (REPEATABLE - 130)) | (1L << (REPLACE - 130)) | (1L << (RESET - 130)) | (1L << (RESPECT - 130)) | (1L << (RESTRICT - 130)) | (1L << (RETURN - 130)) | (1L << (RETURNS - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROLLBACK - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCHEMA - 130)) | (1L << (SCHEMAS - 130)) | (1L << (SECOND - 130)) | (1L << (SERIALIZABLE - 130)) | (1L << (SESSION - 130)) | (1L << (SET - 130)) | (1L << (SETS - 130)) | (1L << (SHOW - 130)) | (1L << (SOME - 130)) | (1L << (SQL - 130)) | (1L << (START - 130)) | (1L << (STATS - 130)) | (1L << (SUBSTRING - 130)) | (1L << (SYSTEM - 130)) | (1L << (TABLES - 130)) | (1L << (TABLESAMPLE - 130)) | (1L << (TEXT - 130)) | (1L << (TIME - 130)) | (1L << (TIMESTAMP - 130)) | (1L << (TO - 130)) | (1L << (TRANSACTION - 130)) | (1L << (TRY_CAST - 130)) | (1L << (TYPE - 130)) | (1L << (UNBOUNDED - 130)) | (1L << (UNCOMMITTED - 130)) | (1L << (USE - 130)) | (1L << (USER - 130)) | (1L << (VALIDATE - 130)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)) | (1L << (IDENTIFIER - 195)) | (1L << (DIGIT_IDENTIFIER - 195)) | (1L << (QUOTED_IDENTIFIER - 195)) | (1L << (BACKQUOTED_IDENTIFIER - 195)))) != 0)) {
					{
					setState(1295);
					identifier();
					setState(1300);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1296);
						match(T__3);
						setState(1297);
						identifier();
						}
						}
						setState(1302);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1305);
				match(T__2);
				setState(1306);
				match(T__5);
				setState(1307);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1308);
				match(T__1);
				setState(1309);
				query();
				setState(1310);
				match(T__2);
				}
				break;
			case 18:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1312);
				match(EXISTS);
				setState(1313);
				match(T__1);
				setState(1314);
				query();
				setState(1315);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1317);
				match(CASE);
				setState(1318);
				valueExpression(0);
				setState(1320); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1319);
					whenClause();
					}
					}
					setState(1322); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1324);
					match(ELSE);
					setState(1325);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1328);
				match(END);
				}
				break;
			case 20:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1330);
				match(CASE);
				setState(1332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1331);
					whenClause();
					}
					}
					setState(1334); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1336);
					match(ELSE);
					setState(1337);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1340);
				match(END);
				}
				break;
			case 21:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1342);
				match(CAST);
				setState(1343);
				match(T__1);
				setState(1344);
				expression();
				setState(1345);
				match(AS);
				setState(1346);
				type(0);
				setState(1347);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1349);
				match(TRY_CAST);
				setState(1350);
				match(T__1);
				setState(1351);
				expression();
				setState(1352);
				match(AS);
				setState(1353);
				type(0);
				setState(1354);
				match(T__2);
				}
				break;
			case 23:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1356);
				match(ARRAY);
				setState(1357);
				match(T__6);
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS) | (1L << EXPLAIN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (ONLY - 64)) | (1L << (OPTION - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNS - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (SQL - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (USE - 128)) | (1L << (USER - 128)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (VALIDATE - 193)) | (1L << (VERBOSE - 193)) | (1L << (VIEW - 193)) | (1L << (WORK - 193)) | (1L << (WRITE - 193)) | (1L << (YEAR - 193)) | (1L << (ZONE - 193)) | (1L << (PLUS - 193)) | (1L << (MINUS - 193)) | (1L << (STRING - 193)) | (1L << (UNICODE_STRING - 193)) | (1L << (BINARY_LITERAL - 193)) | (1L << (INTEGER_VALUE - 193)) | (1L << (DECIMAL_VALUE - 193)) | (1L << (DOUBLE_VALUE - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (DIGIT_IDENTIFIER - 193)) | (1L << (QUOTED_IDENTIFIER - 193)) | (1L << (BACKQUOTED_IDENTIFIER - 193)) | (1L << (DOUBLE_PRECISION - 193)))) != 0)) {
					{
					setState(1358);
					expression();
					setState(1363);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1359);
						match(T__3);
						setState(1360);
						expression();
						}
						}
						setState(1365);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1368);
				match(T__7);
				}
				break;
			case 24:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1369);
				identifier();
				}
				break;
			case 25:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1370);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_DATE);
				}
				break;
			case 26:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1371);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIME);
				setState(1375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1372);
					match(T__1);
					setState(1373);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1374);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 27:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1377);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIMESTAMP);
				setState(1381);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1378);
					match(T__1);
					setState(1379);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1380);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 28:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1383);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIME);
				setState(1387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1384);
					match(T__1);
					setState(1385);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1386);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 29:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1389);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIMESTAMP);
				setState(1393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1390);
					match(T__1);
					setState(1391);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1392);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 30:
				{
				_localctx = new CurrentUserContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1395);
				((CurrentUserContext)_localctx).name = match(CURRENT_USER);
				}
				break;
			case 31:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1396);
				match(SUBSTRING);
				setState(1397);
				match(T__1);
				setState(1398);
				valueExpression(0);
				setState(1399);
				match(FROM);
				setState(1400);
				valueExpression(0);
				setState(1403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1401);
					match(FOR);
					setState(1402);
					valueExpression(0);
					}
				}

				setState(1405);
				match(T__2);
				}
				break;
			case 32:
				{
				_localctx = new NormalizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1407);
				match(NORMALIZE);
				setState(1408);
				match(T__1);
				setState(1409);
				valueExpression(0);
				setState(1412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(1410);
					match(T__3);
					setState(1411);
					normalForm();
					}
				}

				setState(1414);
				match(T__2);
				}
				break;
			case 33:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1416);
				match(EXTRACT);
				setState(1417);
				match(T__1);
				setState(1418);
				identifier();
				setState(1419);
				match(FROM);
				setState(1420);
				valueExpression(0);
				setState(1421);
				match(T__2);
				}
				break;
			case 34:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1423);
				match(T__1);
				setState(1424);
				expression();
				setState(1425);
				match(T__2);
				}
				break;
			case 35:
				{
				_localctx = new GroupingOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1427);
				match(GROUPING);
				setState(1428);
				match(T__1);
				setState(1437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXPLAIN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FORMAT - 66)) | (1L << (FUNCTION - 66)) | (1L << (FUNCTIONS - 66)) | (1L << (GRANT - 66)) | (1L << (GRANTED - 66)) | (1L << (GRANTS - 66)) | (1L << (GRAPHVIZ - 66)) | (1L << (HOUR - 66)) | (1L << (IF - 66)) | (1L << (IGNORE - 66)) | (1L << (INCLUDING - 66)) | (1L << (INPUT - 66)) | (1L << (INTERVAL - 66)) | (1L << (IO - 66)) | (1L << (ISOLATION - 66)) | (1L << (JSON - 66)) | (1L << (LANGUAGE - 66)) | (1L << (LAST - 66)) | (1L << (LATERAL - 66)) | (1L << (LEVEL - 66)) | (1L << (LIMIT - 66)) | (1L << (LOGICAL - 66)) | (1L << (MAP - 66)) | (1L << (MINUTE - 66)) | (1L << (MONTH - 66)) | (1L << (NFC - 66)) | (1L << (NFD - 66)) | (1L << (NFKC - 66)) | (1L << (NFKD - 66)) | (1L << (NO - 66)) | (1L << (NONE - 66)) | (1L << (NULLIF - 66)) | (1L << (NULLS - 66)) | (1L << (ONLY - 66)) | (1L << (OPTION - 66)) | (1L << (ORDINALITY - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (OUTPUT - 130)) | (1L << (OVER - 130)) | (1L << (PARTITION - 130)) | (1L << (PARTITIONS - 130)) | (1L << (POSITION - 130)) | (1L << (PRECEDING - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (RENAME - 130)) | (1L << (REPEATABLE - 130)) | (1L << (REPLACE - 130)) | (1L << (RESET - 130)) | (1L << (RESPECT - 130)) | (1L << (RESTRICT - 130)) | (1L << (RETURN - 130)) | (1L << (RETURNS - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROLLBACK - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCHEMA - 130)) | (1L << (SCHEMAS - 130)) | (1L << (SECOND - 130)) | (1L << (SERIALIZABLE - 130)) | (1L << (SESSION - 130)) | (1L << (SET - 130)) | (1L << (SETS - 130)) | (1L << (SHOW - 130)) | (1L << (SOME - 130)) | (1L << (SQL - 130)) | (1L << (START - 130)) | (1L << (STATS - 130)) | (1L << (SUBSTRING - 130)) | (1L << (SYSTEM - 130)) | (1L << (TABLES - 130)) | (1L << (TABLESAMPLE - 130)) | (1L << (TEXT - 130)) | (1L << (TIME - 130)) | (1L << (TIMESTAMP - 130)) | (1L << (TO - 130)) | (1L << (TRANSACTION - 130)) | (1L << (TRY_CAST - 130)) | (1L << (TYPE - 130)) | (1L << (UNBOUNDED - 130)) | (1L << (UNCOMMITTED - 130)) | (1L << (USE - 130)) | (1L << (USER - 130)) | (1L << (VALIDATE - 130)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)) | (1L << (IDENTIFIER - 195)) | (1L << (DIGIT_IDENTIFIER - 195)) | (1L << (QUOTED_IDENTIFIER - 195)) | (1L << (BACKQUOTED_IDENTIFIER - 195)))) != 0)) {
					{
					setState(1429);
					qualifiedName();
					setState(1434);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1430);
						match(T__3);
						setState(1431);
						qualifiedName();
						}
						}
						setState(1436);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1439);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1450);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1442);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1443);
						match(T__6);
						setState(1444);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(1445);
						match(T__7);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1447);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1448);
						match(T__0);
						setState(1449);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(1454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnicodeStringLiteralContext extends StringContext {
		public TerminalNode UNICODE_STRING() { return getToken(SqlBaseParser.UNICODE_STRING, 0); }
		public TerminalNode UESCAPE() { return getToken(SqlBaseParser.UESCAPE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public UnicodeStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnicodeStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnicodeStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnicodeStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicStringLiteralContext extends StringContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public BasicStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBasicStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBasicStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBasicStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_string);
		try {
			setState(1461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new BasicStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1455);
				match(STRING);
				}
				break;
			case UNICODE_STRING:
				_localctx = new UnicodeStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1456);
				match(UNICODE_STRING);
				setState(1459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1457);
					match(UESCAPE);
					setState(1458);
					match(STRING);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullTreatmentContext extends ParserRuleContext {
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public NullTreatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullTreatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullTreatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullTreatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullTreatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullTreatmentContext nullTreatment() throws RecognitionException {
		NullTreatmentContext _localctx = new NullTreatmentContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_nullTreatment);
		try {
			setState(1467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGNORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1463);
				match(IGNORE);
				setState(1464);
				match(NULLS);
				}
				break;
			case RESPECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1465);
				match(RESPECT);
				setState(1466);
				match(NULLS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeZoneSpecifierContext extends ParserRuleContext {
		public TimeZoneSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneSpecifier; }
	 
		public TimeZoneSpecifierContext() { }
		public void copyFrom(TimeZoneSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeZoneIntervalContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TimeZoneIntervalContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeZoneInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeZoneInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeZoneInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeZoneStringContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TimeZoneStringContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeZoneString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeZoneString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeZoneString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeZoneSpecifierContext timeZoneSpecifier() throws RecognitionException {
		TimeZoneSpecifierContext _localctx = new TimeZoneSpecifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_timeZoneSpecifier);
		try {
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				_localctx = new TimeZoneIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1469);
				match(TIME);
				setState(1470);
				match(ZONE);
				setState(1471);
				interval();
				}
				break;
			case 2:
				_localctx = new TimeZoneStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1472);
				match(TIME);
				setState(1473);
				match(ZONE);
				setState(1474);
				string();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			_la = _input.LA(1);
			if ( !(((((_la - 204)) & ~0x3f) == 0 && ((1L << (_la - 204)) & ((1L << (EQ - 204)) | (1L << (NEQ - 204)) | (1L << (LT - 204)) | (1L << (LTE - 204)) | (1L << (GT - 204)) | (1L << (GTE - 204)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonQuantifierContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public ComparisonQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonQuantifierContext comparisonQuantifier() throws RecognitionException {
		ComparisonQuantifierContext _localctx = new ComparisonQuantifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_comparisonQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public Token sign;
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1483);
			match(INTERVAL);
			setState(1485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1484);
				((IntervalContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((IntervalContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1487);
			string();
			setState(1488);
			((IntervalContext)_localctx).from = intervalField();
			setState(1491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1489);
				match(TO);
				setState(1490);
				((IntervalContext)_localctx).to = intervalField();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalFieldContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_intervalField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (DAY - 47)) | (1L << (HOUR - 47)) | (1L << (MINUTE - 47)) | (1L << (MONTH - 47)))) != 0) || _la==SECOND || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalFormContext extends ParserRuleContext {
		public TerminalNode NFD() { return getToken(SqlBaseParser.NFD, 0); }
		public TerminalNode NFC() { return getToken(SqlBaseParser.NFC, 0); }
		public TerminalNode NFKD() { return getToken(SqlBaseParser.NFKD, 0); }
		public TerminalNode NFKC() { return getToken(SqlBaseParser.NFKC, 0); }
		public NormalFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNormalForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNormalForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNormalForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFormContext normalForm() throws RecognitionException {
		NormalFormContext _localctx = new NormalFormContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_normalForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			_la = _input.LA(1);
			if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (NFC - 112)) | (1L << (NFD - 112)) | (1L << (NFKC - 112)) | (1L << (NFKD - 112)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			match(T__1);
			setState(1506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXPLAIN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FORMAT - 66)) | (1L << (FUNCTION - 66)) | (1L << (FUNCTIONS - 66)) | (1L << (GRANT - 66)) | (1L << (GRANTED - 66)) | (1L << (GRANTS - 66)) | (1L << (GRAPHVIZ - 66)) | (1L << (HOUR - 66)) | (1L << (IF - 66)) | (1L << (IGNORE - 66)) | (1L << (INCLUDING - 66)) | (1L << (INPUT - 66)) | (1L << (INTERVAL - 66)) | (1L << (IO - 66)) | (1L << (ISOLATION - 66)) | (1L << (JSON - 66)) | (1L << (LANGUAGE - 66)) | (1L << (LAST - 66)) | (1L << (LATERAL - 66)) | (1L << (LEVEL - 66)) | (1L << (LIMIT - 66)) | (1L << (LOGICAL - 66)) | (1L << (MAP - 66)) | (1L << (MINUTE - 66)) | (1L << (MONTH - 66)) | (1L << (NFC - 66)) | (1L << (NFD - 66)) | (1L << (NFKC - 66)) | (1L << (NFKD - 66)) | (1L << (NO - 66)) | (1L << (NONE - 66)) | (1L << (NULLIF - 66)) | (1L << (NULLS - 66)) | (1L << (ONLY - 66)) | (1L << (OPTION - 66)) | (1L << (ORDINALITY - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (OUTPUT - 130)) | (1L << (OVER - 130)) | (1L << (PARTITION - 130)) | (1L << (PARTITIONS - 130)) | (1L << (POSITION - 130)) | (1L << (PRECEDING - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (RENAME - 130)) | (1L << (REPEATABLE - 130)) | (1L << (REPLACE - 130)) | (1L << (RESET - 130)) | (1L << (RESPECT - 130)) | (1L << (RESTRICT - 130)) | (1L << (RETURN - 130)) | (1L << (RETURNS - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROLLBACK - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCHEMA - 130)) | (1L << (SCHEMAS - 130)) | (1L << (SECOND - 130)) | (1L << (SERIALIZABLE - 130)) | (1L << (SESSION - 130)) | (1L << (SET - 130)) | (1L << (SETS - 130)) | (1L << (SHOW - 130)) | (1L << (SOME - 130)) | (1L << (SQL - 130)) | (1L << (START - 130)) | (1L << (STATS - 130)) | (1L << (SUBSTRING - 130)) | (1L << (SYSTEM - 130)) | (1L << (TABLES - 130)) | (1L << (TABLESAMPLE - 130)) | (1L << (TEXT - 130)) | (1L << (TIME - 130)) | (1L << (TIMESTAMP - 130)) | (1L << (TO - 130)) | (1L << (TRANSACTION - 130)) | (1L << (TRY_CAST - 130)) | (1L << (TYPE - 130)) | (1L << (UNBOUNDED - 130)) | (1L << (UNCOMMITTED - 130)) | (1L << (USE - 130)) | (1L << (USER - 130)) | (1L << (VALIDATE - 130)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)) | (1L << (IDENTIFIER - 195)) | (1L << (DIGIT_IDENTIFIER - 195)) | (1L << (QUOTED_IDENTIFIER - 195)) | (1L << (BACKQUOTED_IDENTIFIER - 195)) | (1L << (TIME_WITH_TIME_ZONE - 195)) | (1L << (TIMESTAMP_WITH_TIME_ZONE - 195)) | (1L << (DOUBLE_PRECISION - 195)))) != 0)) {
				{
				setState(1498);
				type(0);
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1499);
					match(T__3);
					setState(1500);
					type(0);
					}
					}
					setState(1505);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1508);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1511);
				match(ARRAY);
				setState(1512);
				match(LT);
				setState(1513);
				type(0);
				setState(1514);
				match(GT);
				}
				break;
			case 2:
				{
				setState(1516);
				match(MAP);
				setState(1517);
				match(LT);
				setState(1518);
				type(0);
				setState(1519);
				match(T__3);
				setState(1520);
				type(0);
				setState(1521);
				match(GT);
				}
				break;
			case 3:
				{
				setState(1523);
				match(ROW);
				setState(1524);
				match(T__1);
				setState(1525);
				identifier();
				setState(1526);
				type(0);
				setState(1533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1527);
					match(T__3);
					setState(1528);
					identifier();
					setState(1529);
					type(0);
					}
					}
					setState(1535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1536);
				match(T__2);
				}
				break;
			case 4:
				{
				setState(1538);
				baseType();
				setState(1550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1539);
					match(T__1);
					setState(1540);
					typeParameter();
					setState(1545);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1541);
						match(T__3);
						setState(1542);
						typeParameter();
						}
						}
						setState(1547);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1548);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1552);
				match(INTERVAL);
				setState(1553);
				((TypeContext)_localctx).from = intervalField();
				setState(1554);
				match(TO);
				setState(1555);
				((TypeContext)_localctx).to = intervalField();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1563);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(1559);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(1560);
					match(ARRAY);
					}
					} 
				}
				setState(1565);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeParameter);
		try {
			setState(1568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1566);
				match(INTEGER_VALUE);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case TIME_WITH_TIME_ZONE:
			case TIMESTAMP_WITH_TIME_ZONE:
			case DOUBLE_PRECISION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1567);
				type(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode TIME_WITH_TIME_ZONE() { return getToken(SqlBaseParser.TIME_WITH_TIME_ZONE, 0); }
		public TerminalNode TIMESTAMP_WITH_TIME_ZONE() { return getToken(SqlBaseParser.TIMESTAMP_WITH_TIME_ZONE, 0); }
		public TerminalNode DOUBLE_PRECISION() { return getToken(SqlBaseParser.DOUBLE_PRECISION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_baseType);
		try {
			setState(1574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIME_WITH_TIME_ZONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1570);
				match(TIME_WITH_TIME_ZONE);
				}
				break;
			case TIMESTAMP_WITH_TIME_ZONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1571);
				match(TIMESTAMP_WITH_TIME_ZONE);
				}
				break;
			case DOUBLE_PRECISION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1572);
				match(DOUBLE_PRECISION);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1573);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			match(WHEN);
			setState(1577);
			((WhenClauseContext)_localctx).condition = expression();
			setState(1578);
			match(THEN);
			setState(1579);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			match(FILTER);
			setState(1582);
			match(T__1);
			setState(1583);
			match(WHERE);
			setState(1584);
			booleanExpression(0);
			setState(1585);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverContext over() throws RecognitionException {
		OverContext _localctx = new OverContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_over);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587);
			match(OVER);
			setState(1588);
			match(T__1);
			setState(1599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1589);
				match(PARTITION);
				setState(1590);
				match(BY);
				setState(1591);
				((OverContext)_localctx).expression = expression();
				((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
				setState(1596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1592);
					match(T__3);
					setState(1593);
					((OverContext)_localctx).expression = expression();
					((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
					}
					}
					setState(1598);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1601);
				match(ORDER);
				setState(1602);
				match(BY);
				setState(1603);
				sortItem();
				setState(1608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1604);
					match(T__3);
					setState(1605);
					sortItem();
					}
					}
					setState(1610);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(1613);
				windowFrame();
				}
			}

			setState(1616);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_windowFrame);
		try {
			setState(1634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1618);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1619);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1620);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1621);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1622);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1623);
				match(BETWEEN);
				setState(1624);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1625);
				match(AND);
				setState(1626);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1628);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1629);
				match(BETWEEN);
				setState(1630);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1631);
				match(AND);
				setState(1632);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
	 
		public FrameBoundContext() { }
		public void copyFrom(FrameBoundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public BoundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBoundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBoundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBoundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnboundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public UnboundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnboundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnboundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnboundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentRowBoundContext extends FrameBoundContext {
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public CurrentRowBoundContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentRowBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentRowBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentRowBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_frameBound);
		int _la;
		try {
			setState(1645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1636);
				match(UNBOUNDED);
				setState(1637);
				((UnboundedFrameContext)_localctx).boundType = match(PRECEDING);
				}
				break;
			case 2:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1638);
				match(UNBOUNDED);
				setState(1639);
				((UnboundedFrameContext)_localctx).boundType = match(FOLLOWING);
				}
				break;
			case 3:
				_localctx = new CurrentRowBoundContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1640);
				match(CURRENT);
				setState(1641);
				match(ROW);
				}
				break;
			case 4:
				_localctx = new BoundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1642);
				expression();
				setState(1643);
				((BoundedFrameContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((BoundedFrameContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplainOptionContext extends ParserRuleContext {
		public ExplainOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainOption; }
	 
		public ExplainOptionContext() { }
		public void copyFrom(ExplainOptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainFormatContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode TEXT() { return getToken(SqlBaseParser.TEXT, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(SqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode JSON() { return getToken(SqlBaseParser.JSON, 0); }
		public ExplainFormatContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplainFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplainFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplainFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplainTypeContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(SqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode VALIDATE() { return getToken(SqlBaseParser.VALIDATE, 0); }
		public TerminalNode IO() { return getToken(SqlBaseParser.IO, 0); }
		public ExplainTypeContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplainType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplainType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplainType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplainOptionContext explainOption() throws RecognitionException {
		ExplainOptionContext _localctx = new ExplainOptionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_explainOption);
		int _la;
		try {
			setState(1651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORMAT:
				_localctx = new ExplainFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1647);
				match(FORMAT);
				setState(1648);
				((ExplainFormatContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GRAPHVIZ || _la==JSON || _la==TEXT) ) {
					((ExplainFormatContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TYPE:
				_localctx = new ExplainTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1649);
				match(TYPE);
				setState(1650);
				((ExplainTypeContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (DISTRIBUTED - 54)) | (1L << (IO - 54)) | (1L << (LOGICAL - 54)))) != 0) || _la==VALIDATE) ) {
					((ExplainTypeContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransactionModeContext extends ParserRuleContext {
		public TransactionModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionMode; }
	 
		public TransactionModeContext() { }
		public void copyFrom(TransactionModeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TransactionAccessModeContext extends TransactionModeContext {
		public Token accessMode;
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode WRITE() { return getToken(SqlBaseParser.WRITE, 0); }
		public TransactionAccessModeContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransactionAccessMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransactionAccessMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransactionAccessMode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsolationLevelContext extends TransactionModeContext {
		public TerminalNode ISOLATION() { return getToken(SqlBaseParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(SqlBaseParser.LEVEL, 0); }
		public LevelOfIsolationContext levelOfIsolation() {
			return getRuleContext(LevelOfIsolationContext.class,0);
		}
		public IsolationLevelContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIsolationLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIsolationLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIsolationLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionModeContext transactionMode() throws RecognitionException {
		TransactionModeContext _localctx = new TransactionModeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_transactionMode);
		int _la;
		try {
			setState(1658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ISOLATION:
				_localctx = new IsolationLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1653);
				match(ISOLATION);
				setState(1654);
				match(LEVEL);
				setState(1655);
				levelOfIsolation();
				}
				break;
			case READ:
				_localctx = new TransactionAccessModeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1656);
				match(READ);
				setState(1657);
				((TransactionAccessModeContext)_localctx).accessMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ONLY || _la==WRITE) ) {
					((TransactionAccessModeContext)_localctx).accessMode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LevelOfIsolationContext extends ParserRuleContext {
		public LevelOfIsolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelOfIsolation; }
	 
		public LevelOfIsolationContext() { }
		public void copyFrom(LevelOfIsolationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadUncommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SqlBaseParser.UNCOMMITTED, 0); }
		public ReadUncommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReadUncommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReadUncommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReadUncommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SerializableContext extends LevelOfIsolationContext {
		public TerminalNode SERIALIZABLE() { return getToken(SqlBaseParser.SERIALIZABLE, 0); }
		public SerializableContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSerializable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSerializable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSerializable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadCommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode COMMITTED() { return getToken(SqlBaseParser.COMMITTED, 0); }
		public ReadCommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReadCommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReadCommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReadCommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatableReadContext extends LevelOfIsolationContext {
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public RepeatableReadContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepeatableRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepeatableRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRepeatableRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelOfIsolationContext levelOfIsolation() throws RecognitionException {
		LevelOfIsolationContext _localctx = new LevelOfIsolationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_levelOfIsolation);
		try {
			setState(1667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				_localctx = new ReadUncommittedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1660);
				match(READ);
				setState(1661);
				match(UNCOMMITTED);
				}
				break;
			case 2:
				_localctx = new ReadCommittedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1662);
				match(READ);
				setState(1663);
				match(COMMITTED);
				}
				break;
			case 3:
				_localctx = new RepeatableReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1664);
				match(REPEATABLE);
				setState(1665);
				match(READ);
				}
				break;
			case 4:
				_localctx = new SerializableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1666);
				match(SERIALIZABLE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallArgumentContext extends ParserRuleContext {
		public CallArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgument; }
	 
		public CallArgumentContext() { }
		public void copyFrom(CallArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PositionalArgumentContext extends CallArgumentContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PositionalArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPositionalArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPositionalArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPositionalArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedArgumentContext extends CallArgumentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentContext callArgument() throws RecognitionException {
		CallArgumentContext _localctx = new CallArgumentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_callArgument);
		try {
			setState(1674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				_localctx = new PositionalArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1669);
				expression();
				}
				break;
			case 2:
				_localctx = new NamedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1670);
				identifier();
				setState(1671);
				match(T__8);
				setState(1672);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilege; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrivilege(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrivilege(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeContext privilege() throws RecognitionException {
		PrivilegeContext _localctx = new PrivilegeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_privilege);
		try {
			setState(1680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1676);
				match(SELECT);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1677);
				match(DELETE);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1678);
				match(INSERT);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1679);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			identifier();
			setState(1687);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1683);
					match(T__0);
					setState(1684);
					identifier();
					}
					} 
				}
				setState(1689);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantorContext extends ParserRuleContext {
		public GrantorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantor; }
	 
		public GrantorContext() { }
		public void copyFrom(GrantorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CurrentUserGrantorContext extends GrantorContext {
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public CurrentUserGrantorContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentUserGrantor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentUserGrantor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentUserGrantor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecifiedPrincipalContext extends GrantorContext {
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public SpecifiedPrincipalContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSpecifiedPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSpecifiedPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSpecifiedPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentRoleGrantorContext extends GrantorContext {
		public TerminalNode CURRENT_ROLE() { return getToken(SqlBaseParser.CURRENT_ROLE, 0); }
		public CurrentRoleGrantorContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentRoleGrantor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentRoleGrantor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentRoleGrantor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantorContext grantor() throws RecognitionException {
		GrantorContext _localctx = new GrantorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_grantor);
		try {
			setState(1693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				_localctx = new CurrentUserGrantorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1690);
				match(CURRENT_USER);
				}
				break;
			case 2:
				_localctx = new CurrentRoleGrantorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1691);
				match(CURRENT_ROLE);
				}
				break;
			case 3:
				_localctx = new SpecifiedPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1692);
				principal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrincipalContext extends ParserRuleContext {
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
	 
		public PrincipalContext() { }
		public void copyFrom(PrincipalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnspecifiedPrincipalContext extends PrincipalContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnspecifiedPrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnspecifiedPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnspecifiedPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnspecifiedPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UserPrincipalContext extends PrincipalContext {
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UserPrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUserPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUserPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUserPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RolePrincipalContext extends PrincipalContext {
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RolePrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRolePrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRolePrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRolePrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_principal);
		try {
			setState(1700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				_localctx = new UserPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1695);
				match(USER);
				setState(1696);
				identifier();
				}
				break;
			case 2:
				_localctx = new RolePrincipalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1697);
				match(ROLE);
				setState(1698);
				identifier();
				}
				break;
			case 3:
				_localctx = new UnspecifiedPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1699);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RolesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public RolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRoles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RolesContext roles() throws RecognitionException {
		RolesContext _localctx = new RolesContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_roles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
			identifier();
			setState(1707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1703);
				match(T__3);
				setState(1704);
				identifier();
				}
				}
				setState(1709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BackQuotedIdentifierContext extends IdentifierContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public BackQuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBackQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBackQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBackQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuotedIdentifierContext extends IdentifierContext {
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(SqlBaseParser.QUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DigitIdentifierContext extends IdentifierContext {
		public TerminalNode DIGIT_IDENTIFIER() { return getToken(SqlBaseParser.DIGIT_IDENTIFIER, 0); }
		public DigitIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDigitIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDigitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDigitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_identifier);
		try {
			setState(1715);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1710);
				match(IDENTIFIER);
				}
				break;
			case QUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1711);
				match(QUOTED_IDENTIFIER);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1712);
				nonReserved();
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new BackQuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1713);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			case DIGIT_IDENTIFIER:
				_localctx = new DigitIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1714);
				match(DIGIT_IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_VALUE() { return getToken(SqlBaseParser.DOUBLE_VALUE, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_number);
		try {
			setState(1720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_VALUE:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1717);
				match(DECIMAL_VALUE);
				}
				break;
			case DOUBLE_VALUE:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1718);
				match(DOUBLE_VALUE);
				}
				break;
			case INTEGER_VALUE:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1719);
				match(INTEGER_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode BERNOULLI() { return getToken(SqlBaseParser.BERNOULLI, 0); }
		public TerminalNode CALL() { return getToken(SqlBaseParser.CALL, 0); }
		public TerminalNode CALLED() { return getToken(SqlBaseParser.CALLED, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMMITTED() { return getToken(SqlBaseParser.COMMITTED, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_ROLE() { return getToken(SqlBaseParser.CURRENT_ROLE, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATE() { return getToken(SqlBaseParser.DATE, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(SqlBaseParser.DETERMINISTIC, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(SqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode EXCLUDING() { return getToken(SqlBaseParser.EXCLUDING, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode GRANTED() { return getToken(SqlBaseParser.GRANTED, 0); }
		public TerminalNode GRANTS() { return getToken(SqlBaseParser.GRANTS, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(SqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode INCLUDING() { return getToken(SqlBaseParser.INCLUDING, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode IO() { return getToken(SqlBaseParser.IO, 0); }
		public TerminalNode ISOLATION() { return getToken(SqlBaseParser.ISOLATION, 0); }
		public TerminalNode JSON() { return getToken(SqlBaseParser.JSON, 0); }
		public TerminalNode LANGUAGE() { return getToken(SqlBaseParser.LANGUAGE, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LEVEL() { return getToken(SqlBaseParser.LEVEL, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode NFC() { return getToken(SqlBaseParser.NFC, 0); }
		public TerminalNode NFD() { return getToken(SqlBaseParser.NFD, 0); }
		public TerminalNode NFKC() { return getToken(SqlBaseParser.NFKC, 0); }
		public TerminalNode NFKD() { return getToken(SqlBaseParser.NFKD, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NONE() { return getToken(SqlBaseParser.NONE, 0); }
		public TerminalNode NULLIF() { return getToken(SqlBaseParser.NULLIF, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode ORDINALITY() { return getToken(SqlBaseParser.ORDINALITY, 0); }
		public TerminalNode OUTPUT() { return getToken(SqlBaseParser.OUTPUT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode RETURN() { return getToken(SqlBaseParser.RETURN, 0); }
		public TerminalNode RETURNS() { return getToken(SqlBaseParser.RETURNS, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(SqlBaseParser.SERIALIZABLE, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SQL() { return getToken(SqlBaseParser.SQL, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYSTEM() { return getToken(SqlBaseParser.SYSTEM, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TEXT() { return getToken(SqlBaseParser.TEXT, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SqlBaseParser.UNCOMMITTED, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public TerminalNode VALIDATE() { return getToken(SqlBaseParser.VALIDATE, 0); }
		public TerminalNode VERBOSE() { return getToken(SqlBaseParser.VERBOSE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public TerminalNode WRITE() { return getToken(SqlBaseParser.WRITE, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXPLAIN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FILTER - 66)) | (1L << (FIRST - 66)) | (1L << (FOLLOWING - 66)) | (1L << (FORMAT - 66)) | (1L << (FUNCTION - 66)) | (1L << (FUNCTIONS - 66)) | (1L << (GRANT - 66)) | (1L << (GRANTED - 66)) | (1L << (GRANTS - 66)) | (1L << (GRAPHVIZ - 66)) | (1L << (HOUR - 66)) | (1L << (IF - 66)) | (1L << (IGNORE - 66)) | (1L << (INCLUDING - 66)) | (1L << (INPUT - 66)) | (1L << (INTERVAL - 66)) | (1L << (IO - 66)) | (1L << (ISOLATION - 66)) | (1L << (JSON - 66)) | (1L << (LANGUAGE - 66)) | (1L << (LAST - 66)) | (1L << (LATERAL - 66)) | (1L << (LEVEL - 66)) | (1L << (LIMIT - 66)) | (1L << (LOGICAL - 66)) | (1L << (MAP - 66)) | (1L << (MINUTE - 66)) | (1L << (MONTH - 66)) | (1L << (NFC - 66)) | (1L << (NFD - 66)) | (1L << (NFKC - 66)) | (1L << (NFKD - 66)) | (1L << (NO - 66)) | (1L << (NONE - 66)) | (1L << (NULLIF - 66)) | (1L << (NULLS - 66)) | (1L << (ONLY - 66)) | (1L << (OPTION - 66)) | (1L << (ORDINALITY - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (OUTPUT - 130)) | (1L << (OVER - 130)) | (1L << (PARTITION - 130)) | (1L << (PARTITIONS - 130)) | (1L << (POSITION - 130)) | (1L << (PRECEDING - 130)) | (1L << (PRIVILEGES - 130)) | (1L << (PROPERTIES - 130)) | (1L << (RANGE - 130)) | (1L << (READ - 130)) | (1L << (RENAME - 130)) | (1L << (REPEATABLE - 130)) | (1L << (REPLACE - 130)) | (1L << (RESET - 130)) | (1L << (RESPECT - 130)) | (1L << (RESTRICT - 130)) | (1L << (RETURN - 130)) | (1L << (RETURNS - 130)) | (1L << (REVOKE - 130)) | (1L << (ROLE - 130)) | (1L << (ROLES - 130)) | (1L << (ROLLBACK - 130)) | (1L << (ROW - 130)) | (1L << (ROWS - 130)) | (1L << (SCHEMA - 130)) | (1L << (SCHEMAS - 130)) | (1L << (SECOND - 130)) | (1L << (SERIALIZABLE - 130)) | (1L << (SESSION - 130)) | (1L << (SET - 130)) | (1L << (SETS - 130)) | (1L << (SHOW - 130)) | (1L << (SOME - 130)) | (1L << (SQL - 130)) | (1L << (START - 130)) | (1L << (STATS - 130)) | (1L << (SUBSTRING - 130)) | (1L << (SYSTEM - 130)) | (1L << (TABLES - 130)) | (1L << (TABLESAMPLE - 130)) | (1L << (TEXT - 130)) | (1L << (TIME - 130)) | (1L << (TIMESTAMP - 130)) | (1L << (TO - 130)) | (1L << (TRANSACTION - 130)) | (1L << (TRY_CAST - 130)) | (1L << (TYPE - 130)) | (1L << (UNBOUNDED - 130)) | (1L << (UNCOMMITTED - 130)) | (1L << (USE - 130)) | (1L << (USER - 130)) | (1L << (VALIDATE - 130)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 32:
			return relation_sempred((RelationContext)_localctx, predIndex);
		case 41:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 43:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 44:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 55:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_sempred(RelationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00eb\u06bf\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00af\n\5\3\5\3\5\3\5\5\5"+
		"\u00b4\n\5\3\5\3\5\3\5\3\5\5\5\u00ba\n\5\3\5\3\5\5\5\u00be\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00cc\n\5\3\5\3\5\5\5\u00d0"+
		"\n\5\3\5\3\5\5\5\u00d4\n\5\3\5\3\5\5\5\u00d8\n\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u00e0\n\5\3\5\3\5\5\5\u00e4\n\5\3\5\5\5\u00e7\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u00ee\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u00f5\n\5\f\5\16\5\u00f8"+
		"\13\5\3\5\3\5\3\5\5\5\u00fd\n\5\3\5\3\5\5\5\u0101\n\5\3\5\3\5\3\5\3\5"+
		"\5\5\u0107\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u010e\n\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u0117\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u013b\n\5\3\5\3\5\3\5\5\5\u0140\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u014b\n\5\3\5\3\5\3\5\3\5\5\5\u0151\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5\u0159\n\5\f\5\16\5\u015c\13\5\5\5\u015e\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\u0165\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u016e"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0176\n\5\3\5\3\5\5\5\u017a\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5\u0182\n\5\f\5\16\5\u0185\13\5\5\5\u0187\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0191\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5\u019c\n\5\f\5\16\5\u019f\13\5\3\5\3\5\3\5\5\5\u01a4\n\5\3"+
		"\5\3\5\3\5\5\5\u01a9\n\5\3\5\3\5\3\5\3\5\5\5\u01af\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5\u01b6\n\5\f\5\16\5\u01b9\13\5\3\5\3\5\3\5\5\5\u01be\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u01c5\n\5\3\5\3\5\3\5\3\5\7\5\u01cb\n\5\f\5\16\5\u01ce"+
		"\13\5\3\5\3\5\5\5\u01d2\n\5\3\5\3\5\5\5\u01d6\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u01de\n\5\3\5\3\5\3\5\3\5\5\5\u01e4\n\5\3\5\3\5\3\5\7\5\u01e9"+
		"\n\5\f\5\16\5\u01ec\13\5\3\5\3\5\5\5\u01f0\n\5\3\5\3\5\5\5\u01f4\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01fe\n\5\3\5\5\5\u0201\n\5\3\5\3\5"+
		"\5\5\u0205\n\5\3\5\5\5\u0208\n\5\3\5\3\5\3\5\3\5\7\5\u020e\n\5\f\5\16"+
		"\5\u0211\13\5\3\5\3\5\5\5\u0215\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u0225\n\5\3\5\3\5\3\5\3\5\5\5\u022b\n\5\3\5"+
		"\3\5\3\5\3\5\5\5\u0231\n\5\5\5\u0233\n\5\3\5\3\5\3\5\3\5\5\5\u0239\n\5"+
		"\3\5\3\5\3\5\3\5\5\5\u023f\n\5\5\5\u0241\n\5\3\5\3\5\3\5\3\5\5\5\u0247"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u025a\n\5\3\5\3\5\3\5\5\5\u025f\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0266"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5\u027e\n\5\f\5\16\5\u0281\13\5\5\5\u0283\n\5"+
		"\3\5\3\5\5\5\u0287\n\5\3\5\3\5\5\5\u028b\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u029b\n\5\f\5\16\5\u029e\13\5\5\5\u02a0"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u02a8\n\5\3\6\5\6\u02ab\n\6\3\6\3\6\3"+
		"\7\3\7\5\7\u02b1\n\7\3\7\3\7\3\7\7\7\u02b6\n\7\f\7\16\7\u02b9\13\7\3\b"+
		"\3\b\5\b\u02bd\n\b\3\t\3\t\3\t\3\t\5\t\u02c3\n\t\3\t\3\t\5\t\u02c7\n\t"+
		"\3\t\3\t\5\t\u02cb\n\t\3\n\3\n\3\n\3\n\5\n\u02d1\n\n\3\13\3\13\3\13\3"+
		"\13\7\13\u02d7\n\13\f\13\16\13\u02da\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\7\16\u02e6\n\16\f\16\16\16\u02e9\13\16\3\17\3\17\3\17"+
		"\3\17\5\17\u02ef\n\17\3\20\7\20\u02f2\n\20\f\20\16\20\u02f5\13\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\5\25\u0303\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u030e\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0316\n\27\f\27\16\27\u0319\13\27\5\27\u031b"+
		"\n\27\3\27\3\27\5\27\u031f\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0327"+
		"\n\30\3\30\3\30\3\30\3\30\5\30\u032d\n\30\3\30\7\30\u0330\n\30\f\30\16"+
		"\30\u0333\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u033c\n\31\f\31"+
		"\16\31\u033f\13\31\3\31\3\31\3\31\3\31\5\31\u0345\n\31\3\32\3\32\5\32"+
		"\u0349\n\32\3\32\3\32\5\32\u034d\n\32\3\33\3\33\5\33\u0351\n\33\3\33\3"+
		"\33\3\33\7\33\u0356\n\33\f\33\16\33\u0359\13\33\3\33\3\33\3\33\3\33\7"+
		"\33\u035f\n\33\f\33\16\33\u0362\13\33\5\33\u0364\n\33\3\33\3\33\5\33\u0368"+
		"\n\33\3\33\3\33\3\33\5\33\u036d\n\33\3\33\3\33\5\33\u0371\n\33\3\34\5"+
		"\34\u0374\n\34\3\34\3\34\3\34\7\34\u0379\n\34\f\34\16\34\u037c\13\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\7\35\u0384\n\35\f\35\16\35\u0387\13\35\5"+
		"\35\u0389\n\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0391\n\35\f\35\16\35"+
		"\u0394\13\35\5\35\u0396\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u039f"+
		"\n\35\f\35\16\35\u03a2\13\35\3\35\3\35\5\35\u03a6\n\35\3\36\3\36\3\36"+
		"\3\36\7\36\u03ac\n\36\f\36\16\36\u03af\13\36\5\36\u03b1\n\36\3\36\3\36"+
		"\5\36\u03b5\n\36\3\37\3\37\5\37\u03b9\n\37\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3!\3!\5!\u03c4\n!\3!\5!\u03c7\n!\3!\3!\3!\3!\3!\5!\u03ce\n!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u03e1"+
		"\n\"\7\"\u03e3\n\"\f\"\16\"\u03e6\13\"\3#\5#\u03e9\n#\3#\3#\5#\u03ed\n"+
		"#\3#\3#\5#\u03f1\n#\3#\3#\5#\u03f5\n#\5#\u03f7\n#\3$\3$\3$\3$\3$\3$\3"+
		"$\7$\u0400\n$\f$\16$\u0403\13$\3$\3$\5$\u0407\n$\3%\3%\3%\3%\3%\3%\3%"+
		"\5%\u0410\n%\3&\3&\3\'\3\'\5\'\u0416\n\'\3\'\3\'\5\'\u041a\n\'\5\'\u041c"+
		"\n\'\3(\3(\3(\3(\7(\u0422\n(\f(\16(\u0425\13(\3(\3(\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\7)\u0433\n)\f)\16)\u0436\13)\3)\3)\3)\5)\u043b\n)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\5)\u0446\n)\3*\3*\3+\3+\3+\5+\u044d\n+\3+\3+\5+\u0451"+
		"\n+\3+\3+\3+\3+\3+\3+\7+\u0459\n+\f+\16+\u045c\13+\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\5,\u0468\n,\3,\3,\3,\3,\3,\3,\5,\u0470\n,\3,\3,\3,\3,\3,\7"+
		",\u0477\n,\f,\16,\u047a\13,\3,\3,\3,\5,\u047f\n,\3,\3,\3,\3,\3,\3,\5,"+
		"\u0487\n,\3,\3,\3,\3,\5,\u048d\n,\3,\3,\5,\u0491\n,\3,\3,\3,\5,\u0496"+
		"\n,\3,\3,\3,\5,\u049b\n,\3-\3-\3-\3-\5-\u04a1\n-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\7-\u04af\n-\f-\16-\u04b2\13-\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\6.\u04cc\n.\r.\16.\u04cd"+
		"\3.\3.\3.\3.\3.\3.\3.\7.\u04d7\n.\f.\16.\u04da\13.\3.\3.\3.\3.\3.\3.\3"+
		".\5.\u04e3\n.\3.\5.\u04e6\n.\3.\3.\3.\5.\u04eb\n.\3.\3.\3.\7.\u04f0\n"+
		".\f.\16.\u04f3\13.\5.\u04f5\n.\3.\3.\3.\3.\3.\7.\u04fc\n.\f.\16.\u04ff"+
		"\13.\5.\u0501\n.\3.\3.\5.\u0505\n.\3.\5.\u0508\n.\3.\5.\u050b\n.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\7.\u0515\n.\f.\16.\u0518\13.\5.\u051a\n.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\6.\u052b\n.\r.\16.\u052c\3.\3.\5"+
		".\u0531\n.\3.\3.\3.\3.\6.\u0537\n.\r.\16.\u0538\3.\3.\5.\u053d\n.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u0554\n"+
		".\f.\16.\u0557\13.\5.\u0559\n.\3.\3.\3.\3.\3.\3.\3.\5.\u0562\n.\3.\3."+
		"\3.\3.\5.\u0568\n.\3.\3.\3.\3.\5.\u056e\n.\3.\3.\3.\3.\5.\u0574\n.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\5.\u057e\n.\3.\3.\3.\3.\3.\3.\3.\5.\u0587\n.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u059b\n.\f.\16"+
		".\u059e\13.\5.\u05a0\n.\3.\5.\u05a3\n.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u05ad"+
		"\n.\f.\16.\u05b0\13.\3/\3/\3/\3/\5/\u05b6\n/\5/\u05b8\n/\3\60\3\60\3\60"+
		"\3\60\5\60\u05be\n\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u05c6\n\61\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\5\65\u05d0\n\65\3\65\3\65\3\65"+
		"\3\65\5\65\u05d6\n\65\3\66\3\66\3\67\3\67\38\38\38\38\78\u05e0\n8\f8\16"+
		"8\u05e3\138\58\u05e5\n8\38\38\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\79\u05fe\n9\f9\169\u0601\139\39\39\39\39\39\39"+
		"\39\79\u060a\n9\f9\169\u060d\139\39\39\59\u0611\n9\39\39\39\39\39\59\u0618"+
		"\n9\39\39\79\u061c\n9\f9\169\u061f\139\3:\3:\5:\u0623\n:\3;\3;\3;\3;\5"+
		";\u0629\n;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\7>\u063d"+
		"\n>\f>\16>\u0640\13>\5>\u0642\n>\3>\3>\3>\3>\3>\7>\u0649\n>\f>\16>\u064c"+
		"\13>\5>\u064e\n>\3>\5>\u0651\n>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\5?\u0665\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0670\n@\3"+
		"A\3A\3A\3A\5A\u0676\nA\3B\3B\3B\3B\3B\5B\u067d\nB\3C\3C\3C\3C\3C\3C\3"+
		"C\5C\u0686\nC\3D\3D\3D\3D\3D\5D\u068d\nD\3E\3E\3E\3E\5E\u0693\nE\3F\3"+
		"F\3F\7F\u0698\nF\fF\16F\u069b\13F\3G\3G\3G\5G\u06a0\nG\3H\3H\3H\3H\3H"+
		"\5H\u06a7\nH\3I\3I\3I\7I\u06ac\nI\fI\16I\u06af\13I\3J\3J\3J\3J\3J\5J\u06b6"+
		"\nJ\3K\3K\3K\5K\u06bb\nK\3L\3L\3L\2\b.BTXZpM\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\2\27\4\2\34\34\u0095\u0095\4\2IIWW\4\2>>XX\4\2\16\16\u00dd\u00dd\4\2"+
		"==\u00be\u00be\4\2\25\25\64\64\4\2EEee\4\2\16\16\67\67\4\2\27\27\u00ae"+
		"\u00ae\3\2\u00d4\u00d5\3\2\u00d6\u00d8\3\2\u00ce\u00d3\5\2\16\16\22\22"+
		"\u00a9\u00a9\4\2CC\u00b8\u00b8\7\2\61\61TTop\u00a2\u00a2\u00cc\u00cc\3"+
		"\2ru\4\2FF\u0089\u0089\5\2PPbb\u00b2\u00b2\6\288__mm\u00c3\u00c3\4\2~"+
		"~\u00cb\u00cb/\2\f\16\20\20\22\23\25\27\32\34\37$))++/\61\64\64\66\66"+
		"88>>AADFHHKPTVXXZZ]]__abdfhhjjmprw{|~\177\u0082\u0082\u0084\u0089\u008b"+
		"\u008e\u0090\u0098\u009a\u009c\u009e\u00a2\u00a4\u00ae\u00b0\u00b2\u00b4"+
		"\u00b7\u00b9\u00ba\u00bc\u00bd\u00c0\u00c1\u00c3\u00c3\u00c5\u00c6\u00ca"+
		"\u00cd\2\u07c8\2\u0098\3\2\2\2\4\u009b\3\2\2\2\6\u009e\3\2\2\2\b\u02a7"+
		"\3\2\2\2\n\u02aa\3\2\2\2\f\u02ae\3\2\2\2\16\u02bc\3\2\2\2\20\u02be\3\2"+
		"\2\2\22\u02cc\3\2\2\2\24\u02d2\3\2\2\2\26\u02dd\3\2\2\2\30\u02e1\3\2\2"+
		"\2\32\u02e7\3\2\2\2\34\u02ee\3\2\2\2\36\u02f3\3\2\2\2 \u02f6\3\2\2\2\""+
		"\u02f8\3\2\2\2$\u02fa\3\2\2\2&\u02fd\3\2\2\2(\u0302\3\2\2\2*\u030d\3\2"+
		"\2\2,\u030f\3\2\2\2.\u0320\3\2\2\2\60\u0344\3\2\2\2\62\u0346\3\2\2\2\64"+
		"\u034e\3\2\2\2\66\u0373\3\2\2\28\u03a5\3\2\2\2:\u03b4\3\2\2\2<\u03b6\3"+
		"\2\2\2>\u03bf\3\2\2\2@\u03cd\3\2\2\2B\u03cf\3\2\2\2D\u03f6\3\2\2\2F\u0406"+
		"\3\2\2\2H\u0408\3\2\2\2J\u0411\3\2\2\2L\u0413\3\2\2\2N\u041d\3\2\2\2P"+
		"\u0445\3\2\2\2R\u0447\3\2\2\2T\u0450\3\2\2\2V\u049a\3\2\2\2X\u04a0\3\2"+
		"\2\2Z\u05a2\3\2\2\2\\\u05b7\3\2\2\2^\u05bd\3\2\2\2`\u05c5\3\2\2\2b\u05c7"+
		"\3\2\2\2d\u05c9\3\2\2\2f\u05cb\3\2\2\2h\u05cd\3\2\2\2j\u05d7\3\2\2\2l"+
		"\u05d9\3\2\2\2n\u05db\3\2\2\2p\u0617\3\2\2\2r\u0622\3\2\2\2t\u0628\3\2"+
		"\2\2v\u062a\3\2\2\2x\u062f\3\2\2\2z\u0635\3\2\2\2|\u0664\3\2\2\2~\u066f"+
		"\3\2\2\2\u0080\u0675\3\2\2\2\u0082\u067c\3\2\2\2\u0084\u0685\3\2\2\2\u0086"+
		"\u068c\3\2\2\2\u0088\u0692\3\2\2\2\u008a\u0694\3\2\2\2\u008c\u069f\3\2"+
		"\2\2\u008e\u06a6\3\2\2\2\u0090\u06a8\3\2\2\2\u0092\u06b5\3\2\2\2\u0094"+
		"\u06ba\3\2\2\2\u0096\u06bc\3\2\2\2\u0098\u0099\5\b\5\2\u0099\u009a\7\2"+
		"\2\3\u009a\3\3\2\2\2\u009b\u009c\5R*\2\u009c\u009d\7\2\2\3\u009d\5\3\2"+
		"\2\2\u009e\u009f\5\"\22\2\u009f\u00a0\7\2\2\3\u00a0\7\3\2\2\2\u00a1\u02a8"+
		"\5\n\6\2\u00a2\u00a3\7\u00c0\2\2\u00a3\u02a8\5\u0092J\2\u00a4\u00a5\7"+
		"\u00c0\2\2\u00a5\u00a6\5\u0092J\2\u00a6\u00a7\7\3\2\2\u00a7\u00a8\5\u0092"+
		"J\2\u00a8\u02a8\3\2\2\2\u00a9\u00aa\7&\2\2\u00aa\u00ae\7\u00a0\2\2\u00ab"+
		"\u00ac\7U\2\2\u00ac\u00ad\7y\2\2\u00ad\u00af\7@\2\2\u00ae\u00ab\3\2\2"+
		"\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b3\5\u008aF\2\u00b1"+
		"\u00b2\7\u00c9\2\2\u00b2\u00b4\5\24\13\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u02a8\3\2\2\2\u00b5\u00b6\79\2\2\u00b6\u00b9\7\u00a0\2"+
		"\2\u00b7\u00b8\7U\2\2\u00b8\u00ba\7@\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\5\u008aF\2\u00bc\u00be\t\2\2"+
		"\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u02a8\3\2\2\2\u00bf\u00c0"+
		"\7\17\2\2\u00c0\u00c1\7\u00a0\2\2\u00c1\u00c2\5\u008aF\2\u00c2\u00c3\7"+
		"\u0090\2\2\u00c3\u00c4\7\u00b6\2\2\u00c4\u00c5\5\u0092J\2\u00c5\u02a8"+
		"\3\2\2\2\u00c6\u00c7\7&\2\2\u00c7\u00cb\7\u00af\2\2\u00c8\u00c9\7U\2\2"+
		"\u00c9\u00ca\7y\2\2\u00ca\u00cc\7@\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\5\u008aF\2\u00ce\u00d0\5N(\2"+
		"\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d2"+
		"\7\"\2\2\u00d2\u00d4\5\\/\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d6\7\u00c9\2\2\u00d6\u00d8\5\24\13\2\u00d7\u00d5"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00df\7\24\2\2"+
		"\u00da\u00e0\5\n\6\2\u00db\u00dc\7\4\2\2\u00dc\u00dd\5\n\6\2\u00dd\u00de"+
		"\7\5\2\2\u00de\u00e0\3\2\2\2\u00df\u00da\3\2\2\2\u00df\u00db\3\2\2\2\u00e0"+
		"\u00e6\3\2\2\2\u00e1\u00e3\7\u00c9\2\2\u00e2\u00e4\7v\2\2\u00e3\u00e2"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\7/\2\2\u00e6"+
		"\u00e1\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u02a8\3\2\2\2\u00e8\u00e9\7&"+
		"\2\2\u00e9\u00ed\7\u00af\2\2\u00ea\u00eb\7U\2\2\u00eb\u00ec\7y\2\2\u00ec"+
		"\u00ee\7@\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f0\5\u008aF\2\u00f0\u00f1\7\4\2\2\u00f1\u00f6\5\16\b\2\u00f2"+
		"\u00f3\7\6\2\2\u00f3\u00f5\5\16\b\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3"+
		"\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fc\7\5\2\2\u00fa\u00fb\7\"\2\2\u00fb\u00fd\5\\"+
		"/\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00ff\7\u00c9\2\2\u00ff\u0101\5\24\13\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u02a8\3\2\2\2\u0102\u0103\79\2\2\u0103\u0106\7\u00af\2"+
		"\2\u0104\u0105\7U\2\2\u0105\u0107\7@\2\2\u0106\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u02a8\5\u008aF\2\u0109\u010a\7[\2\2"+
		"\u010a\u010b\7^\2\2\u010b\u010d\5\u008aF\2\u010c\u010e\5N(\2\u010d\u010c"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\5\n\6\2\u0110"+
		"\u02a8\3\2\2\2\u0111\u0112\7\63\2\2\u0112\u0113\7I\2\2\u0113\u0116\5\u008a"+
		"F\2\u0114\u0115\7\u00c8\2\2\u0115\u0117\5T+\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u02a8\3\2\2\2\u0118\u0119\7\17\2\2\u0119\u011a\7"+
		"\u00af\2\2\u011a\u011b\5\u008aF\2\u011b\u011c\7\u0090\2\2\u011c\u011d"+
		"\7\u00b6\2\2\u011d\u011e\5\u008aF\2\u011e\u02a8\3\2\2\2\u011f\u0120\7"+
		"\17\2\2\u0120\u0121\7\u00af\2\2\u0121\u0122\5\u008aF\2\u0122\u0123\7\u0090"+
		"\2\2\u0123\u0124\7 \2\2\u0124\u0125\5\u0092J\2\u0125\u0126\7\u00b6\2\2"+
		"\u0126\u0127\5\u0092J\2\u0127\u02a8\3\2\2\2\u0128\u0129\7\17\2\2\u0129"+
		"\u012a\7\u00af\2\2\u012a\u012b\5\u008aF\2\u012b\u012c\79\2\2\u012c\u012d"+
		"\7 \2\2\u012d\u012e\5\u008aF\2\u012e\u02a8\3\2\2\2\u012f\u0130\7\17\2"+
		"\2\u0130\u0131\7\u00af\2\2\u0131\u0132\5\u008aF\2\u0132\u0133\7\f\2\2"+
		"\u0133\u0134\7 \2\2\u0134\u0135\5\20\t\2\u0135\u02a8\3\2\2\2\u0136\u0137"+
		"\7\20\2\2\u0137\u013a\5\u008aF\2\u0138\u0139\7\u00c9\2\2\u0139\u013b\5"+
		"\24\13\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u02a8\3\2\2\2\u013c"+
		"\u013f\7&\2\2\u013d\u013e\7\u0080\2\2\u013e\u0140\7\u0092\2\2\u013f\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\7\u00c6\2"+
		"\2\u0142\u0143\5\u008aF\2\u0143\u0144\7\24\2\2\u0144\u0145\5\n\6\2\u0145"+
		"\u02a8\3\2\2\2\u0146\u0147\79\2\2\u0147\u014a\7\u00c6\2\2\u0148\u0149"+
		"\7U\2\2\u0149\u014b\7@\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u02a8\5\u008aF\2\u014d\u0150\7&\2\2\u014e\u014f\7"+
		"\u0080\2\2\u014f\u0151\7\u0092\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0153\7K\2\2\u0153\u0154\5\u008aF\2\u0154"+
		"\u015d\7\4\2\2\u0155\u015a\5\30\r\2\u0156\u0157\7\6\2\2\u0157\u0159\5"+
		"\30\r\2\u0158\u0156\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0155\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7\5\2\2\u0160"+
		"\u0161\7\u0097\2\2\u0161\u0164\5p9\2\u0162\u0163\7\"\2\2\u0163\u0165\5"+
		"\\/\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0167\5\32\16\2\u0167\u0168\5\"\22\2\u0168\u02a8\3\2\2\2\u0169\u016a"+
		"\7\17\2\2\u016a\u016b\7K\2\2\u016b\u016d\5\u008aF\2\u016c\u016e\5n8\2"+
		"\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170"+
		"\5\36\20\2\u0170\u02a8\3\2\2\2\u0171\u0172\79\2\2\u0172\u0175\7K\2\2\u0173"+
		"\u0174\7U\2\2\u0174\u0176\7@\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2"+
		"\2\u0176\u0177\3\2\2\2\u0177\u0179\5\u008aF\2\u0178\u017a\5n8\2\u0179"+
		"\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u02a8\3\2\2\2\u017b\u017c\7\32"+
		"\2\2\u017c\u017d\5\u008aF\2\u017d\u0186\7\4\2\2\u017e\u0183\5\u0086D\2"+
		"\u017f\u0180\7\6\2\2\u0180\u0182\5\u0086D\2\u0181\u017f\3\2\2\2\u0182"+
		"\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0187\3\2"+
		"\2\2\u0185\u0183\3\2\2\2\u0186\u017e\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0189\7\5\2\2\u0189\u02a8\3\2\2\2\u018a\u018b\7&"+
		"\2\2\u018b\u018c\7\u009a\2\2\u018c\u0190\5\u0092J\2\u018d\u018e\7\u00c9"+
		"\2\2\u018e\u018f\7\r\2\2\u018f\u0191\5\u008cG\2\u0190\u018d\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u02a8\3\2\2\2\u0192\u0193\79\2\2\u0193\u0194\7\u009a"+
		"\2\2\u0194\u02a8\5\u0092J\2\u0195\u0196\7M\2\2\u0196\u0197\5\u0090I\2"+
		"\u0197\u0198\7\u00b6\2\2\u0198\u019d\5\u008eH\2\u0199\u019a\7\6\2\2\u019a"+
		"\u019c\5\u008eH\2\u019b\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a3\3\2\2\2\u019f\u019d\3\2\2\2\u01a0"+
		"\u01a1\7\u00c9\2\2\u01a1\u01a2\7\r\2\2\u01a2\u01a4\7\177\2\2\u01a3\u01a0"+
		"\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a8\3\2\2\2\u01a5\u01a6\7N\2\2\u01a6"+
		"\u01a7\7\31\2\2\u01a7\u01a9\5\u008cG\2\u01a8\u01a5\3\2\2\2\u01a8\u01a9"+
		"\3\2\2\2\u01a9\u02a8\3\2\2\2\u01aa\u01ae\7\u0098\2\2\u01ab\u01ac\7\r\2"+
		"\2\u01ac\u01ad\7\177\2\2\u01ad\u01af\7G\2\2\u01ae\u01ab\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\5\u0090I\2\u01b1\u01b2"+
		"\7I\2\2\u01b2\u01b7\5\u008eH\2\u01b3\u01b4\7\6\2\2\u01b4\u01b6\5\u008e"+
		"H\2\u01b5\u01b3\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01bd\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\7N"+
		"\2\2\u01bb\u01bc\7\31\2\2\u01bc\u01be\5\u008cG\2\u01bd\u01ba\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u02a8\3\2\2\2\u01bf\u01c0\7\u00a6\2\2\u01c0\u01c4"+
		"\7\u009a\2\2\u01c1\u01c5\7\16\2\2\u01c2\u01c5\7w\2\2\u01c3\u01c5\5\u0092"+
		"J\2\u01c4\u01c1\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5"+
		"\u02a8\3\2\2\2\u01c6\u01d1\7M\2\2\u01c7\u01cc\5\u0088E\2\u01c8\u01c9\7"+
		"\6\2\2\u01c9\u01cb\5\u0088E\2\u01ca\u01c8\3\2\2\2\u01cb\u01ce\3\2\2\2"+
		"\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d2\3\2\2\2\u01ce\u01cc"+
		"\3\2\2\2\u01cf\u01d0\7\16\2\2\u01d0\u01d2\7\u008b\2\2\u01d1\u01c7\3\2"+
		"\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\7}\2\2\u01d4"+
		"\u01d6\7\u00af\2\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01d8\5\u008aF\2\u01d8\u01d9\7\u00b6\2\2\u01d9\u01dd\5"+
		"\u008eH\2\u01da\u01db\7\u00c9\2\2\u01db\u01dc\7M\2\2\u01dc\u01de\7\177"+
		"\2\2\u01dd\u01da\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u02a8\3\2\2\2\u01df"+
		"\u01e3\7\u0098\2\2\u01e0\u01e1\7M\2\2\u01e1\u01e2\7\177\2\2\u01e2\u01e4"+
		"\7G\2\2\u01e3\u01e0\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01ef\3\2\2\2\u01e5"+
		"\u01ea\5\u0088E\2\u01e6\u01e7\7\6\2\2\u01e7\u01e9\5\u0088E\2\u01e8\u01e6"+
		"\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01f0\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee\7\16\2\2\u01ee\u01f0\7"+
		"\u008b\2\2\u01ef\u01e5\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f1\3\2\2\2"+
		"\u01f1\u01f3\7}\2\2\u01f2\u01f4\7\u00af\2\2\u01f3\u01f2\3\2\2\2\u01f3"+
		"\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\5\u008aF\2\u01f6\u01f7"+
		"\7I\2\2\u01f7\u01f8\5\u008eH\2\u01f8\u02a8\3\2\2\2\u01f9\u01fa\7\u00a8"+
		"\2\2\u01fa\u0200\7O\2\2\u01fb\u01fd\7}\2\2\u01fc\u01fe\7\u00af\2\2\u01fd"+
		"\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\5\u008a"+
		"F\2\u0200\u01fb\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u02a8\3\2\2\2\u0202"+
		"\u0204\7A\2\2\u0203\u0205\7\20\2\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2"+
		"\2\2\u0205\u0207\3\2\2\2\u0206\u0208\7\u00c5\2\2\u0207\u0206\3\2\2\2\u0207"+
		"\u0208\3\2\2\2\u0208\u0214\3\2\2\2\u0209\u020a\7\4\2\2\u020a\u020f\5\u0080"+
		"A\2\u020b\u020c\7\6\2\2\u020c\u020e\5\u0080A\2\u020d\u020b\3\2\2\2\u020e"+
		"\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2"+
		"\2\2\u0211\u020f\3\2\2\2\u0212\u0213\7\5\2\2\u0213\u0215\3\2\2\2\u0214"+
		"\u0209\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u02a8\5\b"+
		"\5\2\u0217\u0218\7\u00a8\2\2\u0218\u0219\7&\2\2\u0219\u021a\7\u00af\2"+
		"\2\u021a\u02a8\5\u008aF\2\u021b\u021c\7\u00a8\2\2\u021c\u021d\7&\2\2\u021d"+
		"\u021e\7\u00c6\2\2\u021e\u02a8\5\u008aF\2\u021f\u0220\7\u00a8\2\2\u0220"+
		"\u0221\7&\2\2\u0221\u0222\7K\2\2\u0222\u0224\5\u008aF\2\u0223\u0225\5"+
		"n8\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u02a8\3\2\2\2\u0226"+
		"\u0227\7\u00a8\2\2\u0227\u022a\7\u00b0\2\2\u0228\u0229\t\3\2\2\u0229\u022b"+
		"\5\u008aF\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0232\3\2\2"+
		"\2\u022c\u022d\7i\2\2\u022d\u0230\5\\/\2\u022e\u022f\7<\2\2\u022f\u0231"+
		"\5\\/\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232"+
		"\u022c\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u02a8\3\2\2\2\u0234\u0235\7\u00a8"+
		"\2\2\u0235\u0238\7\u00a1\2\2\u0236\u0237\t\3\2\2\u0237\u0239\5\u0092J"+
		"\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u0240\3\2\2\2\u023a\u023b"+
		"\7i\2\2\u023b\u023e\5\\/\2\u023c\u023d\7<\2\2\u023d\u023f\5\\/\2\u023e"+
		"\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u023a\3\2"+
		"\2\2\u0240\u0241\3\2\2\2\u0241\u02a8\3\2\2\2\u0242\u0243\7\u00a8\2\2\u0243"+
		"\u0246\7\37\2\2\u0244\u0245\7i\2\2\u0245\u0247\5\\/\2\u0246\u0244\3\2"+
		"\2\2\u0246\u0247\3\2\2\2\u0247\u02a8\3\2\2\2\u0248\u0249\7\u00a8\2\2\u0249"+
		"\u024a\7!\2\2\u024a\u024b\t\3\2\2\u024b\u02a8\5\u008aF\2\u024c\u024d\7"+
		"\u00a8\2\2\u024d\u024e\7\u00ac\2\2\u024e\u024f\7G\2\2\u024f\u02a8\5\u008a"+
		"F\2\u0250\u0251\7\u00a8\2\2\u0251\u0252\7\u00ac\2\2\u0252\u0253\7G\2\2"+
		"\u0253\u0254\7\4\2\2\u0254\u0255\5\64\33\2\u0255\u0256\7\5\2\2\u0256\u02a8"+
		"\3\2\2\2\u0257\u0259\7\u00a8\2\2\u0258\u025a\7)\2\2\u0259\u0258\3\2\2"+
		"\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025e\7\u009b\2\2\u025c"+
		"\u025d\t\3\2\2\u025d\u025f\5\u0092J\2\u025e\u025c\3\2\2\2\u025e\u025f"+
		"\3\2\2\2\u025f\u02a8\3\2\2\2\u0260\u0261\7\u00a8\2\2\u0261\u0262\7\u009a"+
		"\2\2\u0262\u0265\7O\2\2\u0263\u0264\t\3\2\2\u0264\u0266\5\u0092J\2\u0265"+
		"\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u02a8\3\2\2\2\u0267\u0268\7\65"+
		"\2\2\u0268\u02a8\5\u008aF\2\u0269\u026a\7\64\2\2\u026a\u02a8\5\u008aF"+
		"\2\u026b\u026c\7\u00a8\2\2\u026c\u02a8\7L\2\2\u026d\u026e\7\u00a8\2\2"+
		"\u026e\u02a8\7\u00a5\2\2\u026f\u0270\7\u00a6\2\2\u0270\u0271\7\u00a5\2"+
		"\2\u0271\u0272\5\u008aF\2\u0272\u0273\7\u00ce\2\2\u0273\u0274\5R*\2\u0274"+
		"\u02a8\3\2\2\2\u0275\u0276\7\u0093\2\2\u0276\u0277\7\u00a5\2\2\u0277\u02a8"+
		"\5\u008aF\2\u0278\u0279\7\u00ab\2\2\u0279\u0282\7\u00b7\2\2\u027a\u027f"+
		"\5\u0082B\2\u027b\u027c\7\6\2\2\u027c\u027e\5\u0082B\2\u027d\u027b\3\2"+
		"\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u027a\3\2\2\2\u0282\u0283\3\2"+
		"\2\2\u0283\u02a8\3\2\2\2\u0284\u0286\7#\2\2\u0285\u0287\7\u00ca\2\2\u0286"+
		"\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u02a8\3\2\2\2\u0288\u028a\7\u009c"+
		"\2\2\u0289\u028b\7\u00ca\2\2\u028a\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b"+
		"\u02a8\3\2\2\2\u028c\u028d\7\u008a\2\2\u028d\u028e\5\u0092J\2\u028e\u028f"+
		"\7I\2\2\u028f\u0290\5\b\5\2\u0290\u02a8\3\2\2\2\u0291\u0292\7\62\2\2\u0292"+
		"\u0293\7\u008a\2\2\u0293\u02a8\5\u0092J\2\u0294\u0295\7?\2\2\u0295\u029f"+
		"\5\u0092J\2\u0296\u0297\7\u00c2\2\2\u0297\u029c\5R*\2\u0298\u0299\7\6"+
		"\2\2\u0299\u029b\5R*\2\u029a\u0298\3\2\2\2\u029b\u029e\3\2\2\2\u029c\u029a"+
		"\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029f"+
		"\u0296\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a8\3\2\2\2\u02a1\u02a2\7\65"+
		"\2\2\u02a2\u02a3\7Z\2\2\u02a3\u02a8\5\u0092J\2\u02a4\u02a5\7\65\2\2\u02a5"+
		"\u02a6\7\u0084\2\2\u02a6\u02a8\5\u0092J\2\u02a7\u00a1\3\2\2\2\u02a7\u00a2"+
		"\3\2\2\2\u02a7\u00a4\3\2\2\2\u02a7\u00a9\3\2\2\2\u02a7\u00b5\3\2\2\2\u02a7"+
		"\u00bf\3\2\2\2\u02a7\u00c6\3\2\2\2\u02a7\u00e8\3\2\2\2\u02a7\u0102\3\2"+
		"\2\2\u02a7\u0109\3\2\2\2\u02a7\u0111\3\2\2\2\u02a7\u0118\3\2\2\2\u02a7"+
		"\u011f\3\2\2\2\u02a7\u0128\3\2\2\2\u02a7\u012f\3\2\2\2\u02a7\u0136\3\2"+
		"\2\2\u02a7\u013c\3\2\2\2\u02a7\u0146\3\2\2\2\u02a7\u014d\3\2\2\2\u02a7"+
		"\u0169\3\2\2\2\u02a7\u0171\3\2\2\2\u02a7\u017b\3\2\2\2\u02a7\u018a\3\2"+
		"\2\2\u02a7\u0192\3\2\2\2\u02a7\u0195\3\2\2\2\u02a7\u01aa\3\2\2\2\u02a7"+
		"\u01bf\3\2\2\2\u02a7\u01c6\3\2\2\2\u02a7\u01df\3\2\2\2\u02a7\u01f9\3\2"+
		"\2\2\u02a7\u0202\3\2\2\2\u02a7\u0217\3\2\2\2\u02a7\u021b\3\2\2\2\u02a7"+
		"\u021f\3\2\2\2\u02a7\u0226\3\2\2\2\u02a7\u0234\3\2\2\2\u02a7\u0242\3\2"+
		"\2\2\u02a7\u0248\3\2\2\2\u02a7\u024c\3\2\2\2\u02a7\u0250\3\2\2\2\u02a7"+
		"\u0257\3\2\2\2\u02a7\u0260\3\2\2\2\u02a7\u0267\3\2\2\2\u02a7\u0269\3\2"+
		"\2\2\u02a7\u026b\3\2\2\2\u02a7\u026d\3\2\2\2\u02a7\u026f\3\2\2\2\u02a7"+
		"\u0275\3\2\2\2\u02a7\u0278\3\2\2\2\u02a7\u0284\3\2\2\2\u02a7\u0288\3\2"+
		"\2\2\u02a7\u028c\3\2\2\2\u02a7\u0291\3\2\2\2\u02a7\u0294\3\2\2\2\u02a7"+
		"\u02a1\3\2\2\2\u02a7\u02a4\3\2\2\2\u02a8\t\3\2\2\2\u02a9\u02ab\5\f\7\2"+
		"\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad"+
		"\5,\27\2\u02ad\13\3\2\2\2\u02ae\u02b0\7\u00c9\2\2\u02af\u02b1\7\u008f"+
		"\2\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2"+
		"\u02b7\5<\37\2\u02b3\u02b4\7\6\2\2\u02b4\u02b6\5<\37\2\u02b5\u02b3\3\2"+
		"\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8"+
		"\r\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bd\5\20\t\2\u02bb\u02bd\5\22\n"+
		"\2\u02bc\u02ba\3\2\2\2\u02bc\u02bb\3\2\2\2\u02bd\17\3\2\2\2\u02be\u02bf"+
		"\5\u0092J\2\u02bf\u02c2\5p9\2\u02c0\u02c1\7y\2\2\u02c1\u02c3\7z\2\2\u02c2"+
		"\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c5\7\""+
		"\2\2\u02c5\u02c7\5\\/\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"\u02ca\3\2\2\2\u02c8\u02c9\7\u00c9\2\2\u02c9\u02cb\5\24\13\2\u02ca\u02c8"+
		"\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\21\3\2\2\2\u02cc\u02cd\7i\2\2\u02cd"+
		"\u02d0\5\u008aF\2\u02ce\u02cf\t\4\2\2\u02cf\u02d1\7\u008c\2\2\u02d0\u02ce"+
		"\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\23\3\2\2\2\u02d2\u02d3\7\4\2\2\u02d3"+
		"\u02d8\5\26\f\2\u02d4\u02d5\7\6\2\2\u02d5\u02d7\5\26\f\2\u02d6\u02d4\3"+
		"\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9"+
		"\u02db\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02dc\7\5\2\2\u02dc\25\3\2\2"+
		"\2\u02dd\u02de\5\u0092J\2\u02de\u02df\7\u00ce\2\2\u02df\u02e0\5R*\2\u02e0"+
		"\27\3\2\2\2\u02e1\u02e2\5\u0092J\2\u02e2\u02e3\5p9\2\u02e3\31\3\2\2\2"+
		"\u02e4\u02e6\5\34\17\2\u02e5\u02e4\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5"+
		"\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\33\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea"+
		"\u02eb\7d\2\2\u02eb\u02ef\5&\24\2\u02ec\u02ef\5(\25\2\u02ed\u02ef\5*\26"+
		"\2\u02ee\u02ea\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ed\3\2\2\2\u02ef\35"+
		"\3\2\2\2\u02f0\u02f2\5 \21\2\u02f1\u02f0\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3"+
		"\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\37\3\2\2\2\u02f5\u02f3\3\2\2"+
		"\2\u02f6\u02f7\5*\26\2\u02f7!\3\2\2\2\u02f8\u02f9\5$\23\2\u02f9#\3\2\2"+
		"\2\u02fa\u02fb\7\u0096\2\2\u02fb\u02fc\5R*\2\u02fc%\3\2\2\2\u02fd\u02fe"+
		"\7\u00aa\2\2\u02fe\'\3\2\2\2\u02ff\u0303\7\66\2\2\u0300\u0301\7y\2\2\u0301"+
		"\u0303\7\66\2\2\u0302\u02ff\3\2\2\2\u0302\u0300\3\2\2\2\u0303)\3\2\2\2"+
		"\u0304\u0305\7\u0097\2\2\u0305\u0306\7z\2\2\u0306\u0307\7}\2\2\u0307\u0308"+
		"\7z\2\2\u0308\u030e\7Z\2\2\u0309\u030a\7\33\2\2\u030a\u030b\7}\2\2\u030b"+
		"\u030c\7z\2\2\u030c\u030e\7Z\2\2\u030d\u0304\3\2\2\2\u030d\u0309\3\2\2"+
		"\2\u030e+\3\2\2\2\u030f\u031a\5.\30\2\u0310\u0311\7\u0081\2\2\u0311\u0312"+
		"\7\31\2\2\u0312\u0317\5\62\32\2\u0313\u0314\7\6\2\2\u0314\u0316\5\62\32"+
		"\2\u0315\u0313\3\2\2\2\u0316\u0319\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0318"+
		"\3\2\2\2\u0318\u031b\3\2\2\2\u0319\u0317\3\2\2\2\u031a\u0310\3\2\2\2\u031a"+
		"\u031b\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031d\7j\2\2\u031d\u031f\t\5"+
		"\2\2\u031e\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f-\3\2\2\2\u0320\u0321"+
		"\b\30\1\2\u0321\u0322\5\60\31\2\u0322\u0331\3\2\2\2\u0323\u0324\f\4\2"+
		"\2\u0324\u0326\7\\\2\2\u0325\u0327\5> \2\u0326\u0325\3\2\2\2\u0326\u0327"+
		"\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0330\5.\30\5\u0329\u032a\f\3\2\2\u032a"+
		"\u032c\t\6\2\2\u032b\u032d\5> \2\u032c\u032b\3\2\2\2\u032c\u032d\3\2\2"+
		"\2\u032d\u032e\3\2\2\2\u032e\u0330\5.\30\4\u032f\u0323\3\2\2\2\u032f\u0329"+
		"\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332"+
		"/\3\2\2\2\u0333\u0331\3\2\2\2\u0334\u0345\5\64\33\2\u0335\u0336\7\u00af"+
		"\2\2\u0336\u0345\5\u008aF\2\u0337\u0338\7\u00c4\2\2\u0338\u033d\5R*\2"+
		"\u0339\u033a\7\6\2\2\u033a\u033c\5R*\2\u033b\u0339\3\2\2\2\u033c\u033f"+
		"\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0345\3\2\2\2\u033f"+
		"\u033d\3\2\2\2\u0340\u0341\7\4\2\2\u0341\u0342\5,\27\2\u0342\u0343\7\5"+
		"\2\2\u0343\u0345\3\2\2\2\u0344\u0334\3\2\2\2\u0344\u0335\3\2\2\2\u0344"+
		"\u0337\3\2\2\2\u0344\u0340\3\2\2\2\u0345\61\3\2\2\2\u0346\u0348\5R*\2"+
		"\u0347\u0349\t\7\2\2\u0348\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034c"+
		"\3\2\2\2\u034a\u034b\7|\2\2\u034b\u034d\t\b\2\2\u034c\u034a\3\2\2\2\u034c"+
		"\u034d\3\2\2\2\u034d\63\3\2\2\2\u034e\u0350\7\u00a3\2\2\u034f\u0351\5"+
		"> \2\u0350\u034f\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0352\3\2\2\2\u0352"+
		"\u0357\5@!\2\u0353\u0354\7\6\2\2\u0354\u0356\5@!\2\u0355\u0353\3\2\2\2"+
		"\u0356\u0359\3\2\2\2\u0357\u0355\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0363"+
		"\3\2\2\2\u0359\u0357\3\2\2\2\u035a\u035b\7I\2\2\u035b\u0360\5B\"\2\u035c"+
		"\u035d\7\6\2\2\u035d\u035f\5B\"\2\u035e\u035c\3\2\2\2\u035f\u0362\3\2"+
		"\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0364\3\2\2\2\u0362"+
		"\u0360\3\2\2\2\u0363\u035a\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0367\3\2"+
		"\2\2\u0365\u0366\7\u00c8\2\2\u0366\u0368\5T+\2\u0367\u0365\3\2\2\2\u0367"+
		"\u0368\3\2\2\2\u0368\u036c\3\2\2\2\u0369\u036a\7Q\2\2\u036a\u036b\7\31"+
		"\2\2\u036b\u036d\5\66\34\2\u036c\u0369\3\2\2\2\u036c\u036d\3\2\2\2\u036d"+
		"\u0370\3\2\2\2\u036e\u036f\7S\2\2\u036f\u0371\5T+\2\u0370\u036e\3\2\2"+
		"\2\u0370\u0371\3\2\2\2\u0371\65\3\2\2\2\u0372\u0374\5> \2\u0373\u0372"+
		"\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u037a\58\35\2\u0376"+
		"\u0377\7\6\2\2\u0377\u0379\58\35\2\u0378\u0376\3\2\2\2\u0379\u037c\3\2"+
		"\2\2\u037a\u0378\3\2\2\2\u037a\u037b\3\2\2\2\u037b\67\3\2\2\2\u037c\u037a"+
		"\3\2\2\2\u037d\u03a6\5:\36\2\u037e\u037f\7\u009d\2\2\u037f\u0388\7\4\2"+
		"\2\u0380\u0385\5R*\2\u0381\u0382\7\6\2\2\u0382\u0384\5R*\2\u0383\u0381"+
		"\3\2\2\2\u0384\u0387\3\2\2\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386"+
		"\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0388\u0380\3\2\2\2\u0388\u0389\3\2"+
		"\2\2\u0389\u038a\3\2\2\2\u038a\u03a6\7\5\2\2\u038b\u038c\7(\2\2\u038c"+
		"\u0395\7\4\2\2\u038d\u0392\5R*\2\u038e\u038f\7\6\2\2\u038f\u0391\5R*\2"+
		"\u0390\u038e\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0393"+
		"\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0392\3\2\2\2\u0395\u038d\3\2\2\2\u0395"+
		"\u0396\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u03a6\7\5\2\2\u0398\u0399\7R"+
		"\2\2\u0399\u039a\7\u00a7\2\2\u039a\u039b\7\4\2\2\u039b\u03a0\5:\36\2\u039c"+
		"\u039d\7\6\2\2\u039d\u039f\5:\36\2\u039e\u039c\3\2\2\2\u039f\u03a2\3\2"+
		"\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a3\3\2\2\2\u03a2"+
		"\u03a0\3\2\2\2\u03a3\u03a4\7\5\2\2\u03a4\u03a6\3\2\2\2\u03a5\u037d\3\2"+
		"\2\2\u03a5\u037e\3\2\2\2\u03a5\u038b\3\2\2\2\u03a5\u0398\3\2\2\2\u03a6"+
		"9\3\2\2\2\u03a7\u03b0\7\4\2\2\u03a8\u03ad\5R*\2\u03a9\u03aa\7\6\2\2\u03aa"+
		"\u03ac\5R*\2\u03ab\u03a9\3\2\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ab\3\2\2"+
		"\2\u03ad\u03ae\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af\u03ad\3\2\2\2\u03b0\u03a8"+
		"\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b5\7\5\2\2\u03b3"+
		"\u03b5\5R*\2\u03b4\u03a7\3\2\2\2\u03b4\u03b3\3\2\2\2\u03b5;\3\2\2\2\u03b6"+
		"\u03b8\5\u0092J\2\u03b7\u03b9\5N(\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3"+
		"\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\7\24\2\2\u03bb\u03bc\7\4\2\2\u03bc"+
		"\u03bd\5\n\6\2\u03bd\u03be\7\5\2\2\u03be=\3\2\2\2\u03bf\u03c0\t\t\2\2"+
		"\u03c0?\3\2\2\2\u03c1\u03c6\5R*\2\u03c2\u03c4\7\24\2\2\u03c3\u03c2\3\2"+
		"\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c7\5\u0092J\2\u03c6"+
		"\u03c3\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03ce\3\2\2\2\u03c8\u03c9\5\u008a"+
		"F\2\u03c9\u03ca\7\3\2\2\u03ca\u03cb\7\u00d6\2\2\u03cb\u03ce\3\2\2\2\u03cc"+
		"\u03ce\7\u00d6\2\2\u03cd\u03c1\3\2\2\2\u03cd\u03c8\3\2\2\2\u03cd\u03cc"+
		"\3\2\2\2\u03ceA\3\2\2\2\u03cf\u03d0\b\"\1\2\u03d0\u03d1\5H%\2\u03d1\u03e4"+
		"\3\2\2\2\u03d2\u03e0\f\4\2\2\u03d3\u03d4\7\'\2\2\u03d4\u03d5\7c\2\2\u03d5"+
		"\u03e1\5H%\2\u03d6\u03d7\5D#\2\u03d7\u03d8\7c\2\2\u03d8\u03d9\5B\"\2\u03d9"+
		"\u03da\5F$\2\u03da\u03e1\3\2\2\2\u03db\u03dc\7q\2\2\u03dc\u03dd\5D#\2"+
		"\u03dd\u03de\7c\2\2\u03de\u03df\5H%\2\u03df\u03e1\3\2\2\2\u03e0\u03d3"+
		"\3\2\2\2\u03e0\u03d6\3\2\2\2\u03e0\u03db\3\2\2\2\u03e1\u03e3\3\2\2\2\u03e2"+
		"\u03d2\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e5\3\2"+
		"\2\2\u03e5C\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03e9\7Y\2\2\u03e8\u03e7"+
		"\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03f7\3\2\2\2\u03ea\u03ec\7g\2\2\u03eb"+
		"\u03ed\7\u0083\2\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03f7"+
		"\3\2\2\2\u03ee\u03f0\7\u0099\2\2\u03ef\u03f1\7\u0083\2\2\u03f0\u03ef\3"+
		"\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f7\3\2\2\2\u03f2\u03f4\7J\2\2\u03f3"+
		"\u03f5\7\u0083\2\2\u03f4\u03f3\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f7"+
		"\3\2\2\2\u03f6\u03e8\3\2\2\2\u03f6\u03ea\3\2\2\2\u03f6\u03ee\3\2\2\2\u03f6"+
		"\u03f2\3\2\2\2\u03f7E\3\2\2\2\u03f8\u03f9\7}\2\2\u03f9\u0407\5T+\2\u03fa"+
		"\u03fb\7\u00c2\2\2\u03fb\u03fc\7\4\2\2\u03fc\u0401\5\u0092J\2\u03fd\u03fe"+
		"\7\6\2\2\u03fe\u0400\5\u0092J\2\u03ff\u03fd\3\2\2\2\u0400\u0403\3\2\2"+
		"\2\u0401\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0404\3\2\2\2\u0403\u0401"+
		"\3\2\2\2\u0404\u0405\7\5\2\2\u0405\u0407\3\2\2\2\u0406\u03f8\3\2\2\2\u0406"+
		"\u03fa\3\2\2\2\u0407G\3\2\2\2\u0408\u040f\5L\'\2\u0409\u040a\7\u00b1\2"+
		"\2\u040a\u040b\5J&\2\u040b\u040c\7\4\2\2\u040c\u040d\5R*\2\u040d\u040e"+
		"\7\5\2\2\u040e\u0410\3\2\2\2\u040f\u0409\3\2\2\2\u040f\u0410\3\2\2\2\u0410"+
		"I\3\2\2\2\u0411\u0412\t\n\2\2\u0412K\3\2\2\2\u0413\u041b\5P)\2\u0414\u0416"+
		"\7\24\2\2\u0415\u0414\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0417\3\2\2\2"+
		"\u0417\u0419\5\u0092J\2\u0418\u041a\5N(\2\u0419\u0418\3\2\2\2\u0419\u041a"+
		"\3\2\2\2\u041a\u041c\3\2\2\2\u041b\u0415\3\2\2\2\u041b\u041c\3\2\2\2\u041c"+
		"M\3\2\2\2\u041d\u041e\7\4\2\2\u041e\u0423\5\u0092J\2\u041f\u0420\7\6\2"+
		"\2\u0420\u0422\5\u0092J\2\u0421\u041f\3\2\2\2\u0422\u0425\3\2\2\2\u0423"+
		"\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0426\3\2\2\2\u0425\u0423\3\2"+
		"\2\2\u0426\u0427\7\5\2\2\u0427O\3\2\2\2\u0428\u0446\5\u008aF\2\u0429\u042a"+
		"\7\4\2\2\u042a\u042b\5\n\6\2\u042b\u042c\7\5\2\2\u042c\u0446\3\2\2\2\u042d"+
		"\u042e\7\u00bf\2\2\u042e\u042f\7\4\2\2\u042f\u0434\5R*\2\u0430\u0431\7"+
		"\6\2\2\u0431\u0433\5R*\2\u0432\u0430\3\2\2\2\u0433\u0436\3\2\2\2\u0434"+
		"\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0437\3\2\2\2\u0436\u0434\3\2"+
		"\2\2\u0437\u043a\7\5\2\2\u0438\u0439\7\u00c9\2\2\u0439\u043b\7\u0082\2"+
		"\2\u043a\u0438\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u0446\3\2\2\2\u043c\u043d"+
		"\7f\2\2\u043d\u043e\7\4\2\2\u043e\u043f\5\n\6\2\u043f\u0440\7\5\2\2\u0440"+
		"\u0446\3\2\2\2\u0441\u0442\7\4\2\2\u0442\u0443\5B\"\2\u0443\u0444\7\5"+
		"\2\2\u0444\u0446\3\2\2\2\u0445\u0428\3\2\2\2\u0445\u0429\3\2\2\2\u0445"+
		"\u042d\3\2\2\2\u0445\u043c\3\2\2\2\u0445\u0441\3\2\2\2\u0446Q\3\2\2\2"+
		"\u0447\u0448\5T+\2\u0448S\3\2\2\2\u0449\u044a\b+\1\2\u044a\u044c\5X-\2"+
		"\u044b\u044d\5V,\2\u044c\u044b\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u0451"+
		"\3\2\2\2\u044e\u044f\7y\2\2\u044f\u0451\5T+\5\u0450\u0449\3\2\2\2\u0450"+
		"\u044e\3\2\2\2\u0451\u045a\3\2\2\2\u0452\u0453\f\4\2\2\u0453\u0454\7\21"+
		"\2\2\u0454\u0459\5T+\5\u0455\u0456\f\3\2\2\u0456\u0457\7\u0080\2\2\u0457"+
		"\u0459\5T+\4\u0458\u0452\3\2\2\2\u0458\u0455\3\2\2\2\u0459\u045c\3\2\2"+
		"\2\u045a\u0458\3\2\2\2\u045a\u045b\3\2\2\2\u045bU\3\2\2\2\u045c\u045a"+
		"\3\2\2\2\u045d\u045e\5b\62\2\u045e\u045f\5X-\2\u045f\u049b\3\2\2\2\u0460"+
		"\u0461\5b\62\2\u0461\u0462\5d\63\2\u0462\u0463\7\4\2\2\u0463\u0464\5\n"+
		"\6\2\u0464\u0465\7\5\2\2\u0465\u049b\3\2\2\2\u0466\u0468\7y\2\2\u0467"+
		"\u0466\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a\7\30"+
		"\2\2\u046a\u046b\5X-\2\u046b\u046c\7\21\2\2\u046c\u046d\5X-\2\u046d\u049b"+
		"\3\2\2\2\u046e\u0470\7y\2\2\u046f\u046e\3\2\2\2\u046f\u0470\3\2\2\2\u0470"+
		"\u0471\3\2\2\2\u0471\u0472\7W\2\2\u0472\u0473\7\4\2\2\u0473\u0478\5R*"+
		"\2\u0474\u0475\7\6\2\2\u0475\u0477\5R*\2\u0476\u0474\3\2\2\2\u0477\u047a"+
		"\3\2\2\2\u0478\u0476\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047b\3\2\2\2\u047a"+
		"\u0478\3\2\2\2\u047b\u047c\7\5\2\2\u047c\u049b\3\2\2\2\u047d\u047f\7y"+
		"\2\2\u047e\u047d\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480\3\2\2\2\u0480"+
		"\u0481\7W\2\2\u0481\u0482\7\4\2\2\u0482\u0483\5\n\6\2\u0483\u0484\7\5"+
		"\2\2\u0484\u049b\3\2\2\2\u0485\u0487\7y\2\2\u0486\u0485\3\2\2\2\u0486"+
		"\u0487\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u0489\7i\2\2\u0489\u048c\5X-"+
		"\2\u048a\u048b\7<\2\2\u048b\u048d\5X-\2\u048c\u048a\3\2\2\2\u048c\u048d"+
		"\3\2\2\2\u048d\u049b\3\2\2\2\u048e\u0490\7`\2\2\u048f\u0491\7y\2\2\u0490"+
		"\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u049b\7z"+
		"\2\2\u0493\u0495\7`\2\2\u0494\u0496\7y\2\2\u0495\u0494\3\2\2\2\u0495\u0496"+
		"\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\7\67\2\2\u0498\u0499\7I\2\2\u0499"+
		"\u049b\5X-\2\u049a\u045d\3\2\2\2\u049a\u0460\3\2\2\2\u049a\u0467\3\2\2"+
		"\2\u049a\u046f\3\2\2\2\u049a\u047e\3\2\2\2\u049a\u0486\3\2\2\2\u049a\u048e"+
		"\3\2\2\2\u049a\u0493\3\2\2\2\u049bW\3\2\2\2\u049c\u049d\b-\1\2\u049d\u04a1"+
		"\5Z.\2\u049e\u049f\t\13\2\2\u049f\u04a1\5X-\6\u04a0\u049c\3\2\2\2\u04a0"+
		"\u049e\3\2\2\2\u04a1\u04b0\3\2\2\2\u04a2\u04a3\f\5\2\2\u04a3\u04a4\t\f"+
		"\2\2\u04a4\u04af\5X-\6\u04a5\u04a6\f\4\2\2\u04a6\u04a7\t\13\2\2\u04a7"+
		"\u04af\5X-\5\u04a8\u04a9\f\3\2\2\u04a9\u04aa\7\u00d9\2\2\u04aa\u04af\5"+
		"X-\4\u04ab\u04ac\f\7\2\2\u04ac\u04ad\7\26\2\2\u04ad\u04af\5`\61\2\u04ae"+
		"\u04a2\3\2\2\2\u04ae\u04a5\3\2\2\2\u04ae\u04a8\3\2\2\2\u04ae\u04ab\3\2"+
		"\2\2\u04af\u04b2\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1"+
		"Y\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b3\u04b4\b.\1\2\u04b4\u05a3\7z\2\2\u04b5"+
		"\u05a3\5h\65\2\u04b6\u04b7\5\u0092J\2\u04b7\u04b8\5\\/\2\u04b8\u05a3\3"+
		"\2\2\2\u04b9\u04ba\7\u00e6\2\2\u04ba\u05a3\5\\/\2\u04bb\u05a3\5\u0094"+
		"K\2\u04bc\u05a3\5f\64\2\u04bd\u05a3\5\\/\2\u04be\u05a3\7\u00dc\2\2\u04bf"+
		"\u05a3\7\7\2\2\u04c0\u04c1\7\u0088\2\2\u04c1\u04c2\7\4\2\2\u04c2\u04c3"+
		"\5X-\2\u04c3\u04c4\7W\2\2\u04c4\u04c5\5X-\2\u04c5\u04c6\7\5\2\2\u04c6"+
		"\u05a3\3\2\2\2\u04c7\u04c8\7\4\2\2\u04c8\u04cb\5R*\2\u04c9\u04ca\7\6\2"+
		"\2\u04ca\u04cc\5R*\2\u04cb\u04c9\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04cb"+
		"\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0\7\5\2\2\u04d0"+
		"\u05a3\3\2\2\2\u04d1\u04d2\7\u009e\2\2\u04d2\u04d3\7\4\2\2\u04d3\u04d8"+
		"\5R*\2\u04d4\u04d5\7\6\2\2\u04d5\u04d7\5R*\2\u04d6\u04d4\3\2\2\2\u04d7"+
		"\u04da\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04db\3\2"+
		"\2\2\u04da\u04d8\3\2\2\2\u04db\u04dc\7\5\2\2\u04dc\u05a3\3\2\2\2\u04dd"+
		"\u04de\5\u008aF\2\u04de\u04df\7\4\2\2\u04df\u04e0\7\u00d6\2\2\u04e0\u04e2"+
		"\7\5\2\2\u04e1\u04e3\5x=\2\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3"+
		"\u04e5\3\2\2\2\u04e4\u04e6\5z>\2\u04e5\u04e4\3\2\2\2\u04e5\u04e6\3\2\2"+
		"\2\u04e6\u05a3\3\2\2\2\u04e7\u04e8\5\u008aF\2\u04e8\u04f4\7\4\2\2\u04e9"+
		"\u04eb\5> \2\u04ea\u04e9\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\3\2\2"+
		"\2\u04ec\u04f1\5R*\2\u04ed\u04ee\7\6\2\2\u04ee\u04f0\5R*\2\u04ef\u04ed"+
		"\3\2\2\2\u04f0\u04f3\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2"+
		"\u04f5\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f4\u04ea\3\2\2\2\u04f4\u04f5\3\2"+
		"\2\2\u04f5\u0500\3\2\2\2\u04f6\u04f7\7\u0081\2\2\u04f7\u04f8\7\31\2\2"+
		"\u04f8\u04fd\5\62\32\2\u04f9\u04fa\7\6\2\2\u04fa\u04fc\5\62\32\2\u04fb"+
		"\u04f9\3\2\2\2\u04fc\u04ff\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fd\u04fe\3\2"+
		"\2\2\u04fe\u0501\3\2\2\2\u04ff\u04fd\3\2\2\2\u0500\u04f6\3\2\2\2\u0500"+
		"\u0501\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0504\7\5\2\2\u0503\u0505\5x"+
		"=\2\u0504\u0503\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u050a\3\2\2\2\u0506"+
		"\u0508\5^\60\2\u0507\u0506\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0509\3\2"+
		"\2\2\u0509\u050b\5z>\2\u050a\u0507\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u05a3"+
		"\3\2\2\2\u050c\u050d\5\u0092J\2\u050d\u050e\7\b\2\2\u050e\u050f\5R*\2"+
		"\u050f\u05a3\3\2\2\2\u0510\u0519\7\4\2\2\u0511\u0516\5\u0092J\2\u0512"+
		"\u0513\7\6\2\2\u0513\u0515\5\u0092J\2\u0514\u0512\3\2\2\2\u0515\u0518"+
		"\3\2\2\2\u0516\u0514\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u051a\3\2\2\2\u0518"+
		"\u0516\3\2\2\2\u0519\u0511\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b\3\2"+
		"\2\2\u051b\u051c\7\5\2\2\u051c\u051d\7\b\2\2\u051d\u05a3\5R*\2\u051e\u051f"+
		"\7\4\2\2\u051f\u0520\5\n\6\2\u0520\u0521\7\5\2\2\u0521\u05a3\3\2\2\2\u0522"+
		"\u0523\7@\2\2\u0523\u0524\7\4\2\2\u0524\u0525\5\n\6\2\u0525\u0526\7\5"+
		"\2\2\u0526\u05a3\3\2\2\2\u0527\u0528\7\35\2\2\u0528\u052a\5X-\2\u0529"+
		"\u052b\5v<\2\u052a\u0529\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052a\3\2\2"+
		"\2\u052c\u052d\3\2\2\2\u052d\u0530\3\2\2\2\u052e\u052f\7:\2\2\u052f\u0531"+
		"\5R*\2\u0530\u052e\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532\3\2\2\2\u0532"+
		"\u0533\7;\2\2\u0533\u05a3\3\2\2\2\u0534\u0536\7\35\2\2\u0535\u0537\5v"+
		"<\2\u0536\u0535\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0536\3\2\2\2\u0538"+
		"\u0539\3\2\2\2\u0539\u053c\3\2\2\2\u053a\u053b\7:\2\2\u053b\u053d\5R*"+
		"\2\u053c\u053a\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u053f"+
		"\7;\2\2\u053f\u05a3\3\2\2\2\u0540\u0541\7\36\2\2\u0541\u0542\7\4\2\2\u0542"+
		"\u0543\5R*\2\u0543\u0544\7\24\2\2\u0544\u0545\5p9\2\u0545\u0546\7\5\2"+
		"\2\u0546\u05a3\3\2\2\2\u0547\u0548\7\u00b9\2\2\u0548\u0549\7\4\2\2\u0549"+
		"\u054a\5R*\2\u054a\u054b\7\24\2\2\u054b\u054c\5p9\2\u054c\u054d\7\5\2"+
		"\2\u054d\u05a3\3\2\2\2\u054e\u054f\7\23\2\2\u054f\u0558\7\t\2\2\u0550"+
		"\u0555\5R*\2\u0551\u0552\7\6\2\2\u0552\u0554\5R*\2\u0553\u0551\3\2\2\2"+
		"\u0554\u0557\3\2\2\2\u0555\u0553\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0559"+
		"\3\2\2\2\u0557\u0555\3\2\2\2\u0558\u0550\3\2\2\2\u0558\u0559\3\2\2\2\u0559"+
		"\u055a\3\2\2\2\u055a\u05a3\7\n\2\2\u055b\u05a3\5\u0092J\2\u055c\u05a3"+
		"\7*\2\2\u055d\u0561\7,\2\2\u055e\u055f\7\4\2\2\u055f\u0560\7\u00dd\2\2"+
		"\u0560\u0562\7\5\2\2\u0561\u055e\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u05a3"+
		"\3\2\2\2\u0563\u0567\7-\2\2\u0564\u0565\7\4\2\2\u0565\u0566\7\u00dd\2"+
		"\2\u0566\u0568\7\5\2\2\u0567\u0564\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u05a3"+
		"\3\2\2\2\u0569\u056d\7k\2\2\u056a\u056b\7\4\2\2\u056b\u056c\7\u00dd\2"+
		"\2\u056c\u056e\7\5\2\2\u056d\u056a\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u05a3"+
		"\3\2\2\2\u056f\u0573\7l\2\2\u0570\u0571\7\4\2\2\u0571\u0572\7\u00dd\2"+
		"\2\u0572\u0574\7\5\2\2\u0573\u0570\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u05a3"+
		"\3\2\2\2\u0575\u05a3\7.\2\2\u0576\u0577\7\u00ad\2\2\u0577\u0578\7\4\2"+
		"\2\u0578\u0579\5X-\2\u0579\u057a\7I\2\2\u057a\u057d\5X-\2\u057b\u057c"+
		"\7G\2\2\u057c\u057e\5X-\2\u057d\u057b\3\2\2\2\u057d\u057e\3\2\2\2\u057e"+
		"\u057f\3\2\2\2\u057f\u0580\7\5\2\2\u0580\u05a3\3\2\2\2\u0581\u0582\7x"+
		"\2\2\u0582\u0583\7\4\2\2\u0583\u0586\5X-\2\u0584\u0585\7\6\2\2\u0585\u0587"+
		"\5l\67\2\u0586\u0584\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0588\3\2\2\2\u0588"+
		"\u0589\7\5\2\2\u0589\u05a3\3\2\2\2\u058a\u058b\7B\2\2\u058b\u058c\7\4"+
		"\2\2\u058c\u058d\5\u0092J\2\u058d\u058e\7I\2\2\u058e\u058f\5X-\2\u058f"+
		"\u0590\7\5\2\2\u0590\u05a3\3\2\2\2\u0591\u0592\7\4\2\2\u0592\u0593\5R"+
		"*\2\u0593\u0594\7\5\2\2\u0594\u05a3\3\2\2\2\u0595\u0596\7R\2\2\u0596\u059f"+
		"\7\4\2\2\u0597\u059c\5\u008aF\2\u0598\u0599\7\6\2\2\u0599\u059b\5\u008a"+
		"F\2\u059a\u0598\3\2\2\2\u059b\u059e\3\2\2\2\u059c\u059a\3\2\2\2\u059c"+
		"\u059d\3\2\2\2\u059d\u05a0\3\2\2\2\u059e\u059c\3\2\2\2\u059f\u0597\3\2"+
		"\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a3\7\5\2\2\u05a2"+
		"\u04b3\3\2\2\2\u05a2\u04b5\3\2\2\2\u05a2\u04b6\3\2\2\2\u05a2\u04b9\3\2"+
		"\2\2\u05a2\u04bb\3\2\2\2\u05a2\u04bc\3\2\2\2\u05a2\u04bd\3\2\2\2\u05a2"+
		"\u04be\3\2\2\2\u05a2\u04bf\3\2\2\2\u05a2\u04c0\3\2\2\2\u05a2\u04c7\3\2"+
		"\2\2\u05a2\u04d1\3\2\2\2\u05a2\u04dd\3\2\2\2\u05a2\u04e7\3\2\2\2\u05a2"+
		"\u050c\3\2\2\2\u05a2\u0510\3\2\2\2\u05a2\u051e\3\2\2\2\u05a2\u0522\3\2"+
		"\2\2\u05a2\u0527\3\2\2\2\u05a2\u0534\3\2\2\2\u05a2\u0540\3\2\2\2\u05a2"+
		"\u0547\3\2\2\2\u05a2\u054e\3\2\2\2\u05a2\u055b\3\2\2\2\u05a2\u055c\3\2"+
		"\2\2\u05a2\u055d\3\2\2\2\u05a2\u0563\3\2\2\2\u05a2\u0569\3\2\2\2\u05a2"+
		"\u056f\3\2\2\2\u05a2\u0575\3\2\2\2\u05a2\u0576\3\2\2\2\u05a2\u0581\3\2"+
		"\2\2\u05a2\u058a\3\2\2\2\u05a2\u0591\3\2\2\2\u05a2\u0595\3\2\2\2\u05a3"+
		"\u05ae\3\2\2\2\u05a4\u05a5\f\20\2\2\u05a5\u05a6\7\t\2\2\u05a6\u05a7\5"+
		"X-\2\u05a7\u05a8\7\n\2\2\u05a8\u05ad\3\2\2\2\u05a9\u05aa\f\16\2\2\u05aa"+
		"\u05ab\7\3\2\2\u05ab\u05ad\5\u0092J\2\u05ac\u05a4\3\2\2\2\u05ac\u05a9"+
		"\3\2\2\2\u05ad\u05b0\3\2\2\2\u05ae\u05ac\3\2\2\2\u05ae\u05af\3\2\2\2\u05af"+
		"[\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b1\u05b8\7\u00da\2\2\u05b2\u05b5\7\u00db"+
		"\2\2\u05b3\u05b4\7\u00bb\2\2\u05b4\u05b6\7\u00da\2\2\u05b5\u05b3\3\2\2"+
		"\2\u05b5\u05b6\3\2\2\2\u05b6\u05b8\3\2\2\2\u05b7\u05b1\3\2\2\2\u05b7\u05b2"+
		"\3\2\2\2\u05b8]\3\2\2\2\u05b9\u05ba\7V\2\2\u05ba\u05be\7|\2\2\u05bb\u05bc"+
		"\7\u0094\2\2\u05bc\u05be\7|\2\2\u05bd\u05b9\3\2\2\2\u05bd\u05bb\3\2\2"+
		"\2\u05be_\3\2\2\2\u05bf\u05c0\7\u00b4\2\2\u05c0\u05c1\7\u00cd\2\2\u05c1"+
		"\u05c6\5h\65\2\u05c2\u05c3\7\u00b4\2\2\u05c3\u05c4\7\u00cd\2\2\u05c4\u05c6"+
		"\5\\/\2\u05c5\u05bf\3\2\2\2\u05c5\u05c2\3\2\2\2\u05c6a\3\2\2\2\u05c7\u05c8"+
		"\t\r\2\2\u05c8c\3\2\2\2\u05c9\u05ca\t\16\2\2\u05cae\3\2\2\2\u05cb\u05cc"+
		"\t\17\2\2\u05ccg\3\2\2\2\u05cd\u05cf\7]\2\2\u05ce\u05d0\t\13\2\2\u05cf"+
		"\u05ce\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d2\5\\"+
		"/\2\u05d2\u05d5\5j\66\2\u05d3\u05d4\7\u00b6\2\2\u05d4\u05d6\5j\66\2\u05d5"+
		"\u05d3\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6i\3\2\2\2\u05d7\u05d8\t\20\2\2"+
		"\u05d8k\3\2\2\2\u05d9\u05da\t\21\2\2\u05dam\3\2\2\2\u05db\u05e4\7\4\2"+
		"\2\u05dc\u05e1\5p9\2\u05dd\u05de\7\6\2\2\u05de\u05e0\5p9\2\u05df\u05dd"+
		"\3\2\2\2\u05e0\u05e3\3\2\2\2\u05e1\u05df\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2"+
		"\u05e5\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e4\u05dc\3\2\2\2\u05e4\u05e5\3\2"+
		"\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e7\7\5\2\2\u05e7o\3\2\2\2\u05e8\u05e9"+
		"\b9\1\2\u05e9\u05ea\7\23\2\2\u05ea\u05eb\7\u00d0\2\2\u05eb\u05ec\5p9\2"+
		"\u05ec\u05ed\7\u00d2\2\2\u05ed\u0618\3\2\2\2\u05ee\u05ef\7n\2\2\u05ef"+
		"\u05f0\7\u00d0\2\2\u05f0\u05f1\5p9\2\u05f1\u05f2\7\6\2\2\u05f2\u05f3\5"+
		"p9\2\u05f3\u05f4\7\u00d2\2\2\u05f4\u0618\3\2\2\2\u05f5\u05f6\7\u009e\2"+
		"\2\u05f6\u05f7\7\4\2\2\u05f7\u05f8\5\u0092J\2\u05f8\u05ff\5p9\2\u05f9"+
		"\u05fa\7\6\2\2\u05fa\u05fb\5\u0092J\2\u05fb\u05fc\5p9\2\u05fc\u05fe\3"+
		"\2\2\2\u05fd\u05f9\3\2\2\2\u05fe\u0601\3\2\2\2\u05ff\u05fd\3\2\2\2\u05ff"+
		"\u0600\3\2\2\2\u0600\u0602\3\2\2\2\u0601\u05ff\3\2\2\2\u0602\u0603\7\5"+
		"\2\2\u0603\u0618\3\2\2\2\u0604\u0610\5t;\2\u0605\u0606\7\4\2\2\u0606\u060b"+
		"\5r:\2\u0607\u0608\7\6\2\2\u0608\u060a\5r:\2\u0609\u0607\3\2\2\2\u060a"+
		"\u060d\3\2\2\2\u060b\u0609\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060e\3\2"+
		"\2\2\u060d\u060b\3\2\2\2\u060e\u060f\7\5\2\2\u060f\u0611\3\2\2\2\u0610"+
		"\u0605\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0618\3\2\2\2\u0612\u0613\7]"+
		"\2\2\u0613\u0614\5j\66\2\u0614\u0615\7\u00b6\2\2\u0615\u0616\5j\66\2\u0616"+
		"\u0618\3\2\2\2\u0617\u05e8\3\2\2\2\u0617\u05ee\3\2\2\2\u0617\u05f5\3\2"+
		"\2\2\u0617\u0604\3\2\2\2\u0617\u0612\3\2\2\2\u0618\u061d\3\2\2\2\u0619"+
		"\u061a\f\b\2\2\u061a\u061c\7\23\2\2\u061b\u0619\3\2\2\2\u061c\u061f\3"+
		"\2\2\2\u061d\u061b\3\2\2\2\u061d\u061e\3\2\2\2\u061eq\3\2\2\2\u061f\u061d"+
		"\3\2\2\2\u0620\u0623\7\u00dd\2\2\u0621\u0623\5p9\2\u0622\u0620\3\2\2\2"+
		"\u0622\u0621\3\2\2\2\u0623s\3\2\2\2\u0624\u0629\7\u00e4\2\2\u0625\u0629"+
		"\7\u00e5\2\2\u0626\u0629\7\u00e6\2\2\u0627\u0629\5\u0092J\2\u0628\u0624"+
		"\3\2\2\2\u0628\u0625\3\2\2\2\u0628\u0626\3\2\2\2\u0628\u0627\3\2\2\2\u0629"+
		"u\3\2\2\2\u062a\u062b\7\u00c7\2\2\u062b\u062c\5R*\2\u062c\u062d\7\u00b3"+
		"\2\2\u062d\u062e\5R*\2\u062ew\3\2\2\2\u062f\u0630\7D\2\2\u0630\u0631\7"+
		"\4\2\2\u0631\u0632\7\u00c8\2\2\u0632\u0633\5T+\2\u0633\u0634\7\5\2\2\u0634"+
		"y\3\2\2\2\u0635\u0636\7\u0085\2\2\u0636\u0641\7\4\2\2\u0637\u0638\7\u0086"+
		"\2\2\u0638\u0639\7\31\2\2\u0639\u063e\5R*\2\u063a\u063b\7\6\2\2\u063b"+
		"\u063d\5R*\2\u063c\u063a\3\2\2\2\u063d\u0640\3\2\2\2\u063e\u063c\3\2\2"+
		"\2\u063e\u063f\3\2\2\2\u063f\u0642\3\2\2\2\u0640\u063e\3\2\2\2\u0641\u0637"+
		"\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u064d\3\2\2\2\u0643\u0644\7\u0081\2"+
		"\2\u0644\u0645\7\31\2\2\u0645\u064a\5\62\32\2\u0646\u0647\7\6\2\2\u0647"+
		"\u0649\5\62\32\2\u0648\u0646\3\2\2\2\u0649\u064c\3\2\2\2\u064a\u0648\3"+
		"\2\2\2\u064a\u064b\3\2\2\2\u064b\u064e\3\2\2\2\u064c\u064a\3\2\2\2\u064d"+
		"\u0643\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u0650\3\2\2\2\u064f\u0651\5|"+
		"?\2\u0650\u064f\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0652\3\2\2\2\u0652"+
		"\u0653\7\5\2\2\u0653{\3\2\2\2\u0654\u0655\7\u008d\2\2\u0655\u0665\5~@"+
		"\2\u0656\u0657\7\u009f\2\2\u0657\u0665\5~@\2\u0658\u0659\7\u008d\2\2\u0659"+
		"\u065a\7\30\2\2\u065a\u065b\5~@\2\u065b\u065c\7\21\2\2\u065c\u065d\5~"+
		"@\2\u065d\u0665\3\2\2\2\u065e\u065f\7\u009f\2\2\u065f\u0660\7\30\2\2\u0660"+
		"\u0661\5~@\2\u0661\u0662\7\21\2\2\u0662\u0663\5~@\2\u0663\u0665\3\2\2"+
		"\2\u0664\u0654\3\2\2\2\u0664\u0656\3\2\2\2\u0664\u0658\3\2\2\2\u0664\u065e"+
		"\3\2\2\2\u0665}\3\2\2\2\u0666\u0667\7\u00bc\2\2\u0667\u0670\7\u0089\2"+
		"\2\u0668\u0669\7\u00bc\2\2\u0669\u0670\7F\2\2\u066a\u066b\7)\2\2\u066b"+
		"\u0670\7\u009e\2\2\u066c\u066d\5R*\2\u066d\u066e\t\22\2\2\u066e\u0670"+
		"\3\2\2\2\u066f\u0666\3\2\2\2\u066f\u0668\3\2\2\2\u066f\u066a\3\2\2\2\u066f"+
		"\u066c\3\2\2\2\u0670\177\3\2\2\2\u0671\u0672\7H\2\2\u0672\u0676\t\23\2"+
		"\2\u0673\u0674\7\u00ba\2\2\u0674\u0676\t\24\2\2\u0675\u0671\3\2\2\2\u0675"+
		"\u0673\3\2\2\2\u0676\u0081\3\2\2\2\u0677\u0678\7a\2\2\u0678\u0679\7h\2"+
		"\2\u0679\u067d\5\u0084C\2\u067a\u067b\7\u008e\2\2\u067b\u067d\t\25\2\2"+
		"\u067c\u0677\3\2\2\2\u067c\u067a\3\2\2\2\u067d\u0083\3\2\2\2\u067e\u067f"+
		"\7\u008e\2\2\u067f\u0686\7\u00bd\2\2\u0680\u0681\7\u008e\2\2\u0681\u0686"+
		"\7$\2\2\u0682\u0683\7\u0091\2\2\u0683\u0686\7\u008e\2\2\u0684\u0686\7"+
		"\u00a4\2\2\u0685\u067e\3\2\2\2\u0685\u0680\3\2\2\2\u0685\u0682\3\2\2\2"+
		"\u0685\u0684\3\2\2\2\u0686\u0085\3\2\2\2\u0687\u068d\5R*\2\u0688\u0689"+
		"\5\u0092J\2\u0689\u068a\7\13\2\2\u068a\u068b\5R*\2\u068b\u068d\3\2\2\2"+
		"\u068c\u0687\3\2\2\2\u068c\u0688\3\2\2\2\u068d\u0087\3\2\2\2\u068e\u0693"+
		"\7\u00a3\2\2\u068f\u0693\7\63\2\2\u0690\u0693\7[\2\2\u0691\u0693\5\u0092"+
		"J\2\u0692\u068e\3\2\2\2\u0692\u068f\3\2\2\2\u0692\u0690\3\2\2\2\u0692"+
		"\u0691\3\2\2\2\u0693\u0089\3\2\2\2\u0694\u0699\5\u0092J\2\u0695\u0696"+
		"\7\3\2\2\u0696\u0698\5\u0092J\2\u0697\u0695\3\2\2\2\u0698\u069b\3\2\2"+
		"\2\u0699\u0697\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u008b\3\2\2\2\u069b\u0699"+
		"\3\2\2\2\u069c\u06a0\7.\2\2\u069d\u06a0\7+\2\2\u069e\u06a0\5\u008eH\2"+
		"\u069f\u069c\3\2\2\2\u069f\u069d\3\2\2\2\u069f\u069e\3\2\2\2\u06a0\u008d"+
		"\3\2\2\2\u06a1\u06a2\7\u00c1\2\2\u06a2\u06a7\5\u0092J\2\u06a3\u06a4\7"+
		"\u009a\2\2\u06a4\u06a7\5\u0092J\2\u06a5\u06a7\5\u0092J\2\u06a6\u06a1\3"+
		"\2\2\2\u06a6\u06a3\3\2\2\2\u06a6\u06a5\3\2\2\2\u06a7\u008f\3\2\2\2\u06a8"+
		"\u06ad\5\u0092J\2\u06a9\u06aa\7\6\2\2\u06aa\u06ac\5\u0092J\2\u06ab\u06a9"+
		"\3\2\2\2\u06ac\u06af\3\2\2\2\u06ad\u06ab\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae"+
		"\u0091\3\2\2\2\u06af\u06ad\3\2\2\2\u06b0\u06b6\7\u00e0\2\2\u06b1\u06b6"+
		"\7\u00e2\2\2\u06b2\u06b6\5\u0096L\2\u06b3\u06b6\7\u00e3\2\2\u06b4\u06b6"+
		"\7\u00e1\2\2\u06b5\u06b0\3\2\2\2\u06b5\u06b1\3\2\2\2\u06b5\u06b2\3\2\2"+
		"\2\u06b5\u06b3\3\2\2\2\u06b5\u06b4\3\2\2\2\u06b6\u0093\3\2\2\2\u06b7\u06bb"+
		"\7\u00de\2\2\u06b8\u06bb\7\u00df\2\2\u06b9\u06bb\7\u00dd\2\2\u06ba\u06b7"+
		"\3\2\2\2\u06ba\u06b8\3\2\2\2\u06ba\u06b9\3\2\2\2\u06bb\u0095\3\2\2\2\u06bc"+
		"\u06bd\t\26\2\2\u06bd\u0097\3\2\2\2\u00d8\u00ae\u00b3\u00b9\u00bd\u00cb"+
		"\u00cf\u00d3\u00d7\u00df\u00e3\u00e6\u00ed\u00f6\u00fc\u0100\u0106\u010d"+
		"\u0116\u013a\u013f\u014a\u0150\u015a\u015d\u0164\u016d\u0175\u0179\u0183"+
		"\u0186\u0190\u019d\u01a3\u01a8\u01ae\u01b7\u01bd\u01c4\u01cc\u01d1\u01d5"+
		"\u01dd\u01e3\u01ea\u01ef\u01f3\u01fd\u0200\u0204\u0207\u020f\u0214\u0224"+
		"\u022a\u0230\u0232\u0238\u023e\u0240\u0246\u0259\u025e\u0265\u027f\u0282"+
		"\u0286\u028a\u029c\u029f\u02a7\u02aa\u02b0\u02b7\u02bc\u02c2\u02c6\u02ca"+
		"\u02d0\u02d8\u02e7\u02ee\u02f3\u0302\u030d\u0317\u031a\u031e\u0326\u032c"+
		"\u032f\u0331\u033d\u0344\u0348\u034c\u0350\u0357\u0360\u0363\u0367\u036c"+
		"\u0370\u0373\u037a\u0385\u0388\u0392\u0395\u03a0\u03a5\u03ad\u03b0\u03b4"+
		"\u03b8\u03c3\u03c6\u03cd\u03e0\u03e4\u03e8\u03ec\u03f0\u03f4\u03f6\u0401"+
		"\u0406\u040f\u0415\u0419\u041b\u0423\u0434\u043a\u0445\u044c\u0450\u0458"+
		"\u045a\u0467\u046f\u0478\u047e\u0486\u048c\u0490\u0495\u049a\u04a0\u04ae"+
		"\u04b0\u04cd\u04d8\u04e2\u04e5\u04ea\u04f1\u04f4\u04fd\u0500\u0504\u0507"+
		"\u050a\u0516\u0519\u052c\u0530\u0538\u053c\u0555\u0558\u0561\u0567\u056d"+
		"\u0573\u057d\u0586\u059c\u059f\u05a2\u05ac\u05ae\u05b5\u05b7\u05bd\u05c5"+
		"\u05cf\u05d5\u05e1\u05e4\u05ff\u060b\u0610\u0617\u061d\u0622\u0628\u063e"+
		"\u0641\u064a\u064d\u0650\u0664\u066f\u0675\u067c\u0685\u068c\u0692\u0699"+
		"\u069f\u06a6\u06ad\u06b5\u06ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}