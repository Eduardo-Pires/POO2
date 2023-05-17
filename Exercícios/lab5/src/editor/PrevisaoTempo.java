package editor;

import publisher.EventManager;

import java.io.File;

public class PrevisaoTempo {
    public EventManager events;
    private File file;

    public PrevisaoTempo()
    {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath)
    {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception
    {
        if (this.file == null) {
            throw new Exception("Please open a file first.");
        }
        else
        {
            events.notify("save", file);
        }
    }


}
