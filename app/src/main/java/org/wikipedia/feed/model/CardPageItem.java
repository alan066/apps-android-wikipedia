package org.wikipedia.feed.model;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.gson.annotations.JsonAdapter;

import org.wikipedia.page.Namespace;
import org.wikipedia.page.NamespaceTypeAdapter;

public class CardPageItem {
    @SuppressWarnings("unused,NullableProblems") @NonNull private String title;
    @SuppressWarnings("unused") @Nullable private Thumbnail thumbnail;
    @SuppressWarnings("unused") @Nullable private String description;
    @SuppressWarnings("unused") @Nullable private String extract;
    @SuppressWarnings("unused") @Nullable @JsonAdapter(NamespaceTypeAdapter.class) private Namespace namespace;

    @NonNull
    public String title() {
        return title;
    }

    @Nullable
    public Uri thumbnail() {
        return thumbnail != null ? Uri.parse(thumbnail.source()) : null;
    }

    @Nullable
    public String description() {
        return description;
    }

    @Nullable
    public String extract() {
        return extract;
    }

    @Nullable
    public Namespace namespace() {
        return namespace;
    }
}
