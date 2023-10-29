package homework5;

public interface UILayer {

    void openProject(String fileName);
    void showProjectSettings();
    void saveProject();
    void printAllModels();
    void printAllTextures();
    void renderAll();
    void renderModel(int i);
    void removeModel(int i);
    void addModel();
    void removeTexture(int i);
    void addTexture();

}
