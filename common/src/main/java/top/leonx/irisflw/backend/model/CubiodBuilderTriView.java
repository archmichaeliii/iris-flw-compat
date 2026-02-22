package top.leonx.irisflw.backend.model;

import net.irisshaders.iris.vertices.views.TriView;
import org.joml.Vector2f;
import org.joml.Vector3f;

public class CubiodBuilderTriView implements TriView {
    Vector3f[] pos;
    Vector2f[] uvs = new Vector2f[] { new Vector2f(), new Vector2f(), new Vector2f(), new Vector2f() };
    public void setup(Vector3f[] pos,float minU, float maxU, float minV, float maxV){
        this.pos = pos;
        uvs[0].set(maxU, minV);
        uvs[1].set(minU, minV);
        uvs[2].set(minU, maxV);
        uvs[3].set(maxU, maxV);
    }
    @Override
    public float x(int i) {
        return pos[i].x();
    }

    @Override
    public float y(int i) {
        return pos[i].y();
    }

    @Override
    public float z(int i) {
        return pos[i].z();
    }

    @Override
    public float u(int i) {
        return uvs[i].x;
    }

    @Override
    public float v(int i) {
        return uvs[i].y;
    }
}
