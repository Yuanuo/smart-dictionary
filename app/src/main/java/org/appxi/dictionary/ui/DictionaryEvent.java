package org.appxi.dictionary.ui;

import org.appxi.event.Event;
import org.appxi.event.EventType;

public class DictionaryEvent extends Event {
    public static final EventType<DictionaryEvent> SEARCH = new EventType<>(Event.ANY, "DICT_SEARCH");
    public static final EventType<DictionaryEvent> SEARCH_EXACT = new EventType<>(Event.ANY, "DICT_SEARCH_EXACT");

    public final String dictionary, text;

    public DictionaryEvent(EventType<DictionaryEvent> eventType, String dictionary, String text) {
        super(eventType);
        this.dictionary = dictionary;
        this.text = text;
    }

    public static DictionaryEvent ofSearch(String text) {
        return new DictionaryEvent(SEARCH, null, text);
    }

    public static DictionaryEvent ofSearchExact(String dictionary, String text) {
        return new DictionaryEvent(SEARCH_EXACT, dictionary, text);
    }
}