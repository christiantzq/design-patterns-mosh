package kurisu.code.designpatterns.behavioural.mediator;

public class ArticlesDialogBox {
    private ListBox articlesListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox(){
        // articlesListBox.attach(new Observer() {
        //     @Override
        //     public void update() {
        //         articleSelected();
        //     }
        // }); // use lambda instead  v

        articlesListBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);        
    }

    public void simulateUserInteraction(){
        articlesListBox.setSelection("Article1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Article 2");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());

    }

    private void titleChanged(){
        String content = titleTextBox.getContent();
        boolean isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }
    
    private void articleSelected(){
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    
}
