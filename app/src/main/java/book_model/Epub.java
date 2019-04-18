package book_model;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class Epub implements Serializable {

    @Expose(deserialize = false)
    private String downloadLink;

    @Expose(deserialize = false)
    private boolean isAvailable;
}
