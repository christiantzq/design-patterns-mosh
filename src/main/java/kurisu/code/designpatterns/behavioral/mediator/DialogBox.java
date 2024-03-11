package kurisu.code.designpatterns.behavioral.mediator;

/**
 * Concrete Mediator
 * 
 * It encapsulates the relationships between the components
 * their management and interactions.
 */
public class DialogBox {
    // List of components
    private ListBox articlesListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public DialogBox() {
        // First we setup the handling
        articlesListBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);
        /*
         * This basically says: "Hey component x, add me (this) to your list
         * of mediators (eventHandlers). Whenever you notify something, I''ll
         * trigger method y".
         * 
         * "Whenever you DO something, let ME know, I'll handle it."
         */
    }

    // "Callback" method?
    private void titleChanged() {
        String content = titleTextBox.getContent();
        boolean isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }

    // "Callback" method?
    private void articleSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    /*
     * This simulates a button that is disabled unless the title is not empty
     */
    public void simulateUserInteraction() {
        articlesListBox.setSelection("Article1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Article 2");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
    }

}
