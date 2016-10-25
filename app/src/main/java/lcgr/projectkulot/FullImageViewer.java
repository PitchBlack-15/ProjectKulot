package lcgr.projectkulot;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import lcgr.projectkulot.Controllers.ImageAdapter;

/**
 * Created by PB5N0203 on 10/25/2016.
 */

public class FullImageViewer extends Activity {
    @Override
    public void onCreate(Bundle savedInstancedState) {
        super.onCreate(savedInstancedState);
        setContentView(R.layout.full_image_viewer);

        Intent i = getIntent();

        int position = i.getExtras().getInt("id");
        ImageAdapter adapter = new ImageAdapter(this);

        ImageView view = (ImageView) findViewById(R.id.imageView);
        view.setImageResource(adapter.mThumbsIds[position]);

    }
}
