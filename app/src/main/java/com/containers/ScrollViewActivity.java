package com.containers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
        llenarTexto();
    }

    private void llenarTexto(){
        String S="Curabitur tempus risus non mauris porttitor cursus. Phasellus sit amet efficitur ante, vitae commodo orci. Praesent vitae metus\n " +
                "eget nibh laoreet lacinia. Donec dapibus, augue in luctus lacinia, arcu mi interdum purus, quis porttitor orci felis accumsan arcu.\n " +
                "Cras varius nibh vel porttitor tincidunt. Sed gravida, ligula in sodales sodales, velit est accumsan diam, sit amet consequat enim risus\n " +
                "quis metus. Aenean eleifend justo quam. Maecenas feugiat enim id rutrum bibendum. Proin molestie lectus a nulla luctus, id egestas dolor\n " +
                "hendrerit. Aenean felis erat, accumsan in ipsum quis, interdum vehicula leo. Sed nulla lectus, ultrices non lorem non, suscipit luctus purus\n" +
                ". Etiam euismod eleifend ligula, ut ultrices eros dapibus et. Nunc egestas arcu quis risus lobortis mattis.\n" +
                "\n" +
                "\n" +
                "Curabitur tempus risus non mauris porttitor cursus. Phasellus sit amet efficitur ante, vitae commodo orci. Praesent vitae metus\n " +
                "eget nibh laoreet lacinia. Donec dapibus, augue in luctus lacinia, arcu mi interdum purus, quis porttitor orci felis accumsan arcu.\n " +
                "Cras varius nibh vel porttitor tincidunt. Sed gravida, ligula in sodales sodales, velit est accumsan diam, sit amet consequat enim risus\n " +
                "quis metus. Aenean eleifend justo quam. Maecenas feugiat enim id rutrum bibendum. Proin molestie lectus a nulla luctus, id egestas dolor\n " +
                "hendrerit. Aenean felis erat, accumsan in ipsum quis, interdum vehicula leo. Sed nulla lectus, ultrices non lorem non, suscipit luctus purus\n" +
                ". Etiam euismod eleifend ligula, ut ultrices eros dapibus et. Nunc egestas arcu quis risus lobortis mattis.\n" +
                "\n" +"Curabitur tempus risus non mauris porttitor cursus. Phasellus sit amet efficitur ante, vitae commodo orci. Praesent vitae metus\n " +
                "eget nibh laoreet lacinia. Donec dapibus, augue in luctus lacinia, arcu mi interdum purus, quis porttitor orci felis accumsan arcu.\n " +
                "Cras varius nibh vel porttitor tincidunt. Sed gravida, ligula in sodales sodales, velit est accumsan diam, sit amet consequat enim risus\n " +
                "quis metus. Aenean eleifend justo quam. Maecenas feugiat enim id rutrum bibendum. Proin molestie lectus a nulla luctus, id egestas dolor\n " +
                "hendrerit. Aenean felis erat, accumsan in ipsum quis, interdum vehicula leo. Sed nulla lectus, ultrices non lorem non, suscipit luctus purus\n" +
                ". Etiam euismod eleifend ligula, ut ultrices eros dapibus et. Nunc egestas arcu quis risus lobortis mattis.\n" +
                "\n" +
                "\n" +
                "Curabitur tempus risus non mauris porttitor cursus. Phasellus sit amet efficitur ante, vitae commodo orci. Praesent vitae metus\n " +
                "eget nibh laoreet lacinia. Donec dapibus, augue in luctus lacinia, arcu mi interdum purus, quis porttitor orci felis accumsan arcu.\n " +
                "Cras varius nibh vel porttitor tincidunt. Sed gravida, ligula in sodales sodales, velit est accumsan diam, sit amet consequat enim risus\n " +
                "quis metus. Aenean eleifend justo quam. Maecenas feugiat enim id rutrum bibendum. Proin molestie lectus a nulla luctus, id egestas dolor\n " +
                "hendrerit. Aenean felis erat, accumsan in ipsum quis, interdum vehicula leo. Sed nulla lectus, ultrices non lorem non, suscipit luctus purus\n" +
                ". Etiam euismod eleifend ligula, ut ultrices eros dapibus et. Nunc egestas arcu quis risus lobortis mattis.\n" +
                "\n" +
                "\n" +
                "Curabitur tempus risus non mauris porttitor cursus. Phasellus sit amet efficitur ante, vitae commodo orci. Praesent vitae metus\n " +
                "eget nibh laoreet lacinia. Donec dapibus, augue in luctus lacinia, arcu mi interdum purus, quis porttitor orci felis accumsan arcu.\n " +
                "Cras varius nibh vel porttitor tincidunt. Sed gravida, ligula in sodales sodales, velit est accumsan diam, sit amet consequat enim risus\n " +
                "quis metus. Aenean eleifend justo quam. Maecenas feugiat enim id rutrum bibendum. Proin molestie lectus a nulla luctus, id egestas dolor\n " +
                "hendrerit. Aenean felis erat, accumsan in ipsum quis, interdum vehicula leo. Sed nulla lectus, ultrices non lorem non, suscipit luctus purus\n" +
                ". Etiam euismod eleifend ligula, ut ultrices eros dapibus et. Nunc egestas arcu quis risus lobortis mattis.\n" +
                "\n" +
                "\n" +
                "Curabitur tempus risus non mauris porttitor cursus. Phasellus sit amet efficitur ante, vitae commodo orci. Praesent vitae metus\n " +
                "eget nibh laoreet lacinia. Donec dapibus, augue in luctus lacinia, arcu mi interdum purus, quis porttitor orci felis accumsan arcu.\n " +
                "Cras varius nibh vel porttitor tincidunt. Sed gravida, ligula in sodales sodales, velit est accumsan diam, sit amet consequat enim risus\n " +
                "quis metus. Aenean eleifend justo quam. Maecenas feugiat enim id rutrum bibendum. Proin molestie lectus a nulla luctus, id egestas dolor\n " +
                "hendrerit. Aenean felis erat, accumsan in ipsum quis, interdum vehicula leo. Sed nulla lectus, ultrices non lorem non, suscipit luctus purus\n" +
                ". Etiam euismod eleifend ligula, ut ultrices eros dapibus et. Nunc egestas arcu quis risus lobortis mattis.\n" +
                "\n\n" +
                "Curabitur tempus risus non mauris porttitor cursus. Phasellus sit amet efficitur ante, vitae commodo orci. Praesent vitae metus\n " +
                "eget nibh laoreet lacinia. Donec dapibus, augue in luctus lacinia, arcu mi interdum purus, quis porttitor orci felis accumsan arcu.\n " +
                "Cras varius nibh vel porttitor tincidunt. Sed gravida, ligula in sodales sodales, velit est accumsan diam, sit amet consequat enim risus\n " +
                "quis metus. Aenean eleifend justo quam. Maecenas feugiat enim id rutrum bibendum. Proin molestie lectus a nulla luctus, id egestas dolor\n " +
                "hendrerit. Aenean felis erat, accumsan in ipsum quis, interdum vehicula leo. Sed nulla lectus, ultrices non lorem non, suscipit luctus purus\n" +
                ". Etiam euismod eleifend ligula, ut ultrices eros dapibus et. Nunc egestas arcu quis risus lobortis mattis.\n" +
                "\n";
        TextView text = (TextView) findViewById(R.id.textView);

        text.setText(S);

    }
}
