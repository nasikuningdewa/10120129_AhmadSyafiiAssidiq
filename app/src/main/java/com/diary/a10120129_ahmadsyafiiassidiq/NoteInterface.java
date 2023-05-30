package com.diary.a10120129_ahmadsyafiiassidiq;

import android.database.Cursor;

import com.diary.a10120129_ahmadsyafiiassidiq.model.Note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}

