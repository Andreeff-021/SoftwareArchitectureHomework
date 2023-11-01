package homework6.infrastructure.persistance;

import homework6.database.NotesRecord;

public abstract class DbContext {

    protected Database database;

    public DbContext(Database database) {
        this.database = database;
    }

    protected abstract void onModelCreating(ModelBuilder builder);

    public boolean saveChanges(){
        //TODO: Сохранение изменений в базе данных
        return true;
    }

}
