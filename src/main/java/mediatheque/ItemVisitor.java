/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

import java.util.List;

/**
 *
 * @author dell
 */
public interface ItemVisitor {
    void visit(Book book);
    void visit(CD cd);
}
