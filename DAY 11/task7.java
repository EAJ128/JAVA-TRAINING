/*

Design Document Editor where user create different types of document like text doc,image doc,spread sheet doc

REQUIREMENT:
	
	1.Each document should open, save, close
	2.Different document types behaves differently
		Text->Shows text Content
		Image->Renders Image
		SpreadSheet->Calculate cells;
		
RULES:

	User should not know internal logic
	Document Data must be Protected
	System should allow adding new document type
	


 */



interface DocumentActions {
    void open();
    void save();
    void close();
    void process();
}

abstract class Document implements DocumentActions {

    private String name;
    private int size;

    public Document(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public Document() {
    }

    public void getName() {
        System.out.println(name +" Of Size "+size);
    }

    @Override
    public void open() {
        System.out.println("Opening " + name);
    }

    @Override
    public void save() {
        System.out.println("Saving " + name);
    }

    @Override
    public void close() {
        System.out.println("Closing " + name);
    }

    @Override
    public abstract void process();
}

class TextDoc extends Document {
    public TextDoc(String name, int size) {
        super(name, size);
    }

    @Override
    public void process() {
        System.out.print("Showing text content: " );
        getName();
    }
}

class ImageDoc extends Document {
    public ImageDoc(String name, int size) {
        super(name, size);
    }

    @Override
    public void process() {
        System.out.print("Rendering image: ");
        getName();
    }
}

class SpreadsheetDoc extends Document {
    public SpreadsheetDoc(String name, int size) {
        super(name, size);
    }

    @Override
    public void process() {
        System.out.println("Calculating cells: " );
        getName();
    }
}

public class task7 {
    public static void main(String[] args) {

        Document[] docs = {new TextDoc("file.txt", 10),new ImageDoc("photo.png", 20),new SpreadsheetDoc("data.xlsx", 30)};

        for (Document doc : docs) {
        	doc.open();
            doc.process();
            doc.save();
            doc.close();
            System.out.println();
            doc.getName();
            System.out.println();
        }
    }
}