package less_2.Ex006.Format;

import less_2.Ex006.Document.TextDocument;
import less_2.Ex006.Interface.Saveable;

public abstract class TextFormat implements Saveable {
    public abstract void SaveAs(TextDocument document, String path);
}
