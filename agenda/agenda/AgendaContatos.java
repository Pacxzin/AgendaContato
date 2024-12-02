package agenda

import javax.swing.SwingUtilities;

/**
 * 
 *  Classe principal que inicializa a aplicação Agenda de Contatos
 *  Responsavel por criar as instnacias dos componentes MVC e iniciar a interface
 * 
 * @author Daniel Ohata
 * @version 1.0
 */
public class AgendaContatos {

    public static void main(String[] args) {
        //executa a inicialização da aplicação na thread de eventos do Swing
        SwingUtilities.invokeLater(() -> {
        
        ContatoView view = new ContatoView();
        ContatoModel model = new ContatoModel();
        new ContatoController(view,model);

        view.setVisible(true);

        });




    }

}
