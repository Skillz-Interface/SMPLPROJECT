package MySMPL.syntax;

import MySMPL.semantics.Visitor;
import MySMPL.sys.SmplException;

public abstract class ASTNode {

    public abstract <S, T> T visit(Visitor<S, T> v, S state) throws SmplException ;

    @Override
    public abstract String toString();

}
