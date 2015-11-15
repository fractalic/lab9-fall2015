// Generated from Formula.g4 by ANTLR 4.4

package formula;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FormulaParser}.
 */
public interface FormulaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FormulaParser#negation}.
	 * @param ctx the parse tree
	 */
	void enterNegation(@NotNull FormulaParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#negation}.
	 * @param ctx the parse tree
	 */
	void exitNegation(@NotNull FormulaParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(@NotNull FormulaParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(@NotNull FormulaParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(@NotNull FormulaParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(@NotNull FormulaParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FormulaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull FormulaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FormulaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull FormulaParser.LiteralContext ctx);
}