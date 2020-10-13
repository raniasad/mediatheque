/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

/**
 *
 * @author dell
 */
public class CDVisitorImpl implements ItemVisitor{
    @Override
	public void visit(Book book) {
                   
            }

	@Override
	public void visit(CD cd) {  
                System.out.println(cd.toString());
                
	}
}
