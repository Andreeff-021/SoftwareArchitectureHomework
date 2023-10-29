package homework5;

import java.util.Collection;

public interface BusinessLogicalLayer {

    Collection<Model3D> getAllModels();
    Collection<Texture> getAllTextures();

    void renderModel(Model3D model);
    void renderAllModels();
    void removeModel(Model3D model);
    void addModel(Model3D model);
    void removeTexture(Texture texture);
    void addTexture(Texture texture);
}
