package homework6.application.interfaces;

import homework6.domain.Note;

import java.util.Collection;

public interface NotesDatabaseContext {

    Collection<Note> getAll();
    boolean saveChanges();

}
