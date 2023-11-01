package homework6.presentation.queries.controllers;

import homework6.application.interfaces.NoteEditor;
import homework6.domain.Note;
import homework6.presentation.queries.controllers.Controller;

public class NotesController extends Controller {

    private final NoteEditor noteEditor;

    public NotesController(NoteEditor noteEditor) {
        this.noteEditor = noteEditor;
    }

    //TODO: \notes\all
    public void routeGetAll(){
        noteEditor.printAll();
    }

    public void addNote(Note note){
        noteEditor.add(note);
    }

}
