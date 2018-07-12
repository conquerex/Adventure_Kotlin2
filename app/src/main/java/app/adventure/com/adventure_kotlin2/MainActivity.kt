package app.adventure.com.adventure_kotlin2

import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.SurfaceHolder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SurfaceHolder.Callback, MediaPlayer.OnPreparedListener {
    override fun surfaceChanged(holder: SurfaceHolder?, format: Int, width: Int, height: Int) {
        //
    }

    override fun surfaceDestroyed(holder: SurfaceHolder?) {
        //
    }

    override fun surfaceCreated(holder: SurfaceHolder?) {
        var url = "https://www.rmp-streaming.com/media/bbb-360p.mp4"
        mediaPlayer = MediaPlayer()
        mediaPlayer!!. setDisplay(holder)
        mediaPlayer!!.setDataSource(url)
        mediaPlayer!!.prepare()
        mediaPlayer!!.setOnPreparedListener(this) // this : MediaPlayer.OnPreparedListener --> fun onPrepared
    }

    override fun onPrepared(mp: MediaPlayer?) {
        mediaPlayer!!.start()
    }

    var surfaceHolder : SurfaceHolder? = null
    var mediaPlayer : MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        surfaceHolder = surfaceView.holder
        surfaceHolder!!.addCallback(this) // 상단에 implement된 것을 연결

    }}
