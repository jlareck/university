public enum States {
    INITIAL,
    ERROR,
    SLASH,
    POUND_SIGN,
    IDENTIFIER_NOT_LITERAL,
    IDENTIFIER_LITERAL,
    ZERO_FIRST,
    CHAR_LITERAL,
    STRING_LITERAL,
    DOT,
    GREATER,
    LESS,
    AT_SIGN,
    END_OF_TRIPLE_QUOTES_1,
    END_OF_TRIPLE_QUOTES_2,
    DOUBLE_QUOTES,
    TRIPLE_QUOTES,
    SINGLE_OPERATOR,
    PLUS,
    MINUS,
    PIPE,
    SINGLE_LINE_COMMENT,
    MULTI_LINE_COMMENT,
    HEX_DIGITS,
    INTEGER_SUFFIX,
    NON_ZERO_DIGIT,
    DEFINE_METHOD,
    POINT_IN_DIGIT,
    POSSIBLE_ESCAPE_SEQUENCE_CHAR,
    EXPECT_END_OF_CHAR,
    POSSIBLE_ESCAPE_SEQUENCE,
    DOUBLE_GREATER,
    OPERATOR_AND_EQUAL,
    STAR_IN_MULTI_LINE_COMMENT,
    FLOAT_SUFFIX,
    DOUBLE_LESS,
    TRIPLE_GREATER,
    TRIPLE_LESS
}
