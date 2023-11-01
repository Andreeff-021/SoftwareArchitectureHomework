package homework6.application;

import homework6.application.interfaces.NoteEditor;
import homework6.application.interfaces.NotesDatabaseContext;
import homework6.application.interfaces.NotesPresenter;
import homework6.domain.Note;

import java.util.Collection;
import java.util.Optional;

public class ConcreteNoteEditor implements NoteEditor {

    private final NotesDatabaseContext dbContext;
    private final NotesPresenter presenter;

    public ConcreteNoteEditor(
            NotesPresenter presenter,
            NotesDatabaseContext dbContext) {
        this.dbContext = dbContext;
        this.presenter = presenter;
    }

    @Override
    public boolean add(Note item) {
        dbContext.getAll().add(item);
        return dbContext.saveChanges();
    }

    @Override
    public boolean edit(Note item) {
        return false;
    }

    @Override
    public boolean remove(Note item) {
        dbContext.getAll().remove(item);
        return dbContext.saveChanges();
    }

    @Override
    public Optional<Note> getById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public Collection<Note> getAll() {
        return dbContext.getAll();
    }

    @Override
    public void printAll() {
        presenter.printAll(getAll());
    }

}
