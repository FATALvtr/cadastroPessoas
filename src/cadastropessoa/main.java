
package cadastropessoa;

import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        
        CadastroPessoa c = new CadastroPessoa();
        
        ArrayList lista = new ArrayList();
        
        c.menu(pessoa1);
        
    }

}
