package MySMPL.syntax;

import MySMPL.semantics.Visitor;
import MySMPL.syntax.Exp;
import MySMPL.sys.SmplException;


public class ExpDef extends Exp {

	String var;
	Exp exp;

	public ExpDef(String id, Exp e) {
		var = id;
		exp = e;
	}

	public String getVar(){
		return var;
	}

	public Exp getExp(){
		return exp;
	}

	@Override
	public <S, T> T visit(Visitor<S, T> v, S arg) throws SmplException {
		return v.visitExpDef(this, arg);
	}

	@Override
	public String toString() {
		return "def " , var.toString(), exp.toString();
	}
}
