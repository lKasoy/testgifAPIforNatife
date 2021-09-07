package com.example.gifapp;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONArray;


class Analytics {

        @SerializedName("onload")
        @Expose
        private Onload onload;
        @SerializedName("onclick")
        @Expose
        private Onclick onclick;
        @SerializedName("onsent")
        @Expose
        private Onsent onsent;

        public Onload getOnload() {
            return onload;
        }

        public void setOnload(Onload onload) {
            this.onload = onload;
        }

        public Onclick getOnclick() {
            return onclick;
        }

        public void setOnclick(Onclick onclick) {
            this.onclick = onclick;
        }

        public Onsent getOnsent() {
            return onsent;
        }

        public void setOnsent(Onsent onsent) {
            this.onsent = onsent;
        }

    }

    class GifInfoResult {

        @SerializedName("data")
        @Expose
        private List<Datum> data = null;
        @SerializedName("pagination")
        @Expose
        private Pagination pagination;
        @SerializedName("meta")
        @Expose
        private Meta meta;

        public List<Datum> getData() {
            return data;
        }

        public void setData(List<Datum> data) {
            this.data = data;
        }

        public Pagination getPagination() {
            return pagination;
        }

        public void setPagination(Pagination pagination) {
            this.pagination = pagination;
        }

        public Meta getMeta() {
            return meta;
        }

        public void setMeta(Meta meta) {
            this.meta = meta;
        }

    }

    class Datum extends JSONArray {

        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("bitly_gif_url")
        @Expose
        private String bitlyGifUrl;
        @SerializedName("bitly_url")
        @Expose
        private String bitlyUrl;
        @SerializedName("embed_url")
        @Expose
        private String embedUrl;
        @SerializedName("username")
        @Expose
        private String username;
        @SerializedName("source")
        @Expose
        private String source;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("rating")
        @Expose
        private String rating;
        @SerializedName("content_url")
        @Expose
        private String contentUrl;
        @SerializedName("source_tld")
        @Expose
        private String sourceTld;
        @SerializedName("source_post_url")
        @Expose
        private String sourcePostUrl;
        @SerializedName("is_sticker")
        @Expose
        private Integer isSticker;
        @SerializedName("import_datetime")
        @Expose
        private String importDatetime;
        @SerializedName("trending_datetime")
        @Expose
        private String trendingDatetime;
        @SerializedName("images")
        @Expose
        private Images images;
        @SerializedName("analytics_response_payload")
        @Expose
        private String analyticsResponsePayload;
        @SerializedName("analytics")
        @Expose
        private Analytics analytics;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getBitlyGifUrl() {
            return bitlyGifUrl;
        }

        public void setBitlyGifUrl(String bitlyGifUrl) {
            this.bitlyGifUrl = bitlyGifUrl;
        }

        public String getBitlyUrl() {
            return bitlyUrl;
        }

        public void setBitlyUrl(String bitlyUrl) {
            this.bitlyUrl = bitlyUrl;
        }

        public String getEmbedUrl() {
            return embedUrl;
        }

        public void setEmbedUrl(String embedUrl) {
            this.embedUrl = embedUrl;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getContentUrl() {
            return contentUrl;
        }

        public void setContentUrl(String contentUrl) {
            this.contentUrl = contentUrl;
        }

        public String getSourceTld() {
            return sourceTld;
        }

        public void setSourceTld(String sourceTld) {
            this.sourceTld = sourceTld;
        }

        public String getSourcePostUrl() {
            return sourcePostUrl;
        }

        public void setSourcePostUrl(String sourcePostUrl) {
            this.sourcePostUrl = sourcePostUrl;
        }

        public Integer getIsSticker() {
            return isSticker;
        }

        public void setIsSticker(Integer isSticker) {
            this.isSticker = isSticker;
        }

        public String getImportDatetime() {
            return importDatetime;
        }

        public void setImportDatetime(String importDatetime) {
            this.importDatetime = importDatetime;
        }

        public String getTrendingDatetime() {
            return trendingDatetime;
        }

        public void setTrendingDatetime(String trendingDatetime) {
            this.trendingDatetime = trendingDatetime;
        }

        public Images getImages() {
            return images;
        }

        public void setImages(Images images) {
            this.images = images;
        }

        public String getAnalyticsResponsePayload() {
            return analyticsResponsePayload;
        }

        public void setAnalyticsResponsePayload(String analyticsResponsePayload) {
            this.analyticsResponsePayload = analyticsResponsePayload;
        }

        public Analytics getAnalytics() {
            return analytics;
        }

        public void setAnalytics(Analytics analytics) {
            this.analytics = analytics;
        }

    }

    class Downsized {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    class DownsizedLarge {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    class DownsizedMedium {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    class DownsizedSmall {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("mp4_size")
        @Expose
        private String mp4Size;
        @SerializedName("mp4")
        @Expose
        private String mp4;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

    }

    class DownsizedStill {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    class FixedHeight {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("mp4_size")
        @Expose
        private String mp4Size;
        @SerializedName("mp4")
        @Expose
        private String mp4;
        @SerializedName("webp_size")
        @Expose
        private String webpSize;
        @SerializedName("webp")
        @Expose
        private String webp;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

        public String getWebpSize() {
            return webpSize;
        }

        public void setWebpSize(String webpSize) {
            this.webpSize = webpSize;
        }

        public String getWebp() {
            return webp;
        }

        public void setWebp(String webp) {
            this.webp = webp;
        }

    }

    class FixedHeightDownsampled {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("webp_size")
        @Expose
        private String webpSize;
        @SerializedName("webp")
        @Expose
        private String webp;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWebpSize() {
            return webpSize;
        }

        public void setWebpSize(String webpSize) {
            this.webpSize = webpSize;
        }

        public String getWebp() {
            return webp;
        }

        public void setWebp(String webp) {
            this.webp = webp;
        }

    }
    class FixedHeightSmall {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("mp4_size")
        @Expose
        private String mp4Size;
        @SerializedName("mp4")
        @Expose
        private String mp4;
        @SerializedName("webp_size")
        @Expose
        private String webpSize;
        @SerializedName("webp")
        @Expose
        private String webp;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

        public String getWebpSize() {
            return webpSize;
        }

        public void setWebpSize(String webpSize) {
            this.webpSize = webpSize;
        }

        public String getWebp() {
            return webp;
        }

        public void setWebp(String webp) {
            this.webp = webp;
        }

    }
class FixedHeightSmallStill {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }
class FixedHeightStill {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }
class FixedWidth {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("mp4_size")
        @Expose
        private String mp4Size;
        @SerializedName("mp4")
        @Expose
        private String mp4;
        @SerializedName("webp_size")
        @Expose
        private String webpSize;
        @SerializedName("webp")
        @Expose
        private String webp;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

        public String getWebpSize() {
            return webpSize;
        }

        public void setWebpSize(String webpSize) {
            this.webpSize = webpSize;
        }

        public String getWebp() {
            return webp;
        }

        public void setWebp(String webp) {
            this.webp = webp;
        }

    }
class FixedWidthDownsampled {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("webp_size")
        @Expose
        private String webpSize;
        @SerializedName("webp")
        @Expose
        private String webp;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWebpSize() {
            return webpSize;
        }

        public void setWebpSize(String webpSize) {
            this.webpSize = webpSize;
        }

        public String getWebp() {
            return webp;
        }

        public void setWebp(String webp) {
            this.webp = webp;
        }

    }
class FixedWidthSmall {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("mp4_size")
        @Expose
        private String mp4Size;
        @SerializedName("mp4")
        @Expose
        private String mp4;
        @SerializedName("webp_size")
        @Expose
        private String webpSize;
        @SerializedName("webp")
        @Expose
        private String webp;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

        public String getWebpSize() {
            return webpSize;
        }

        public void setWebpSize(String webpSize) {
            this.webpSize = webpSize;
        }

        public String getWebp() {
            return webp;
        }

        public void setWebp(String webp) {
            this.webp = webp;
        }

    }
class FixedWidthSmallStill {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }
class FixedWidthStill {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }
class Images {

        @SerializedName("original")
        @Expose
        private Original original;
        @SerializedName("downsized")
        @Expose
        private Downsized downsized;
        @SerializedName("downsized_large")
        @Expose
        private DownsizedLarge downsizedLarge;
        @SerializedName("downsized_medium")
        @Expose
        private DownsizedMedium downsizedMedium;
        @SerializedName("downsized_small")
        @Expose
        private DownsizedSmall downsizedSmall;
        @SerializedName("downsized_still")
        @Expose
        private DownsizedStill downsizedStill;
        @SerializedName("fixed_height")
        @Expose
        private FixedHeight fixedHeight;
        @SerializedName("fixed_height_downsampled")
        @Expose
        private FixedHeightDownsampled fixedHeightDownsampled;
        @SerializedName("fixed_height_small")
        @Expose
        private FixedHeightSmall fixedHeightSmall;
        @SerializedName("fixed_height_small_still")
        @Expose
        private FixedHeightSmallStill fixedHeightSmallStill;
        @SerializedName("fixed_height_still")
        @Expose
        private FixedHeightStill fixedHeightStill;
        @SerializedName("fixed_width")
        @Expose
        private FixedWidth fixedWidth;
        @SerializedName("fixed_width_downsampled")
        @Expose
        private FixedWidthDownsampled fixedWidthDownsampled;
        @SerializedName("fixed_width_small")
        @Expose
        private FixedWidthSmall fixedWidthSmall;
        @SerializedName("fixed_width_small_still")
        @Expose
        private FixedWidthSmallStill fixedWidthSmallStill;
        @SerializedName("fixed_width_still")
        @Expose
        private FixedWidthStill fixedWidthStill;
        @SerializedName("looping")
        @Expose
        private Looping looping;
        @SerializedName("original_still")
        @Expose
        private OriginalStill originalStill;
        @SerializedName("original_mp4")
        @Expose
        private OriginalMp4 originalMp4;
        @SerializedName("preview")
        @Expose
        private Preview preview;
        @SerializedName("preview_gif")
        @Expose
        private PreviewGif previewGif;
        @SerializedName("preview_webp")
        @Expose
        private PreviewWebp previewWebp;
        @SerializedName("480w_still")
        @Expose
        private com.example.gifapp._480wStill _480wStill;

        public Original getOriginal() {
            return original;
        }

        public void setOriginal(Original original) {
            this.original = original;
        }

        public Downsized getDownsized() {
            return downsized;
        }

        public void setDownsized(Downsized downsized) {
            this.downsized = downsized;
        }

        public DownsizedLarge getDownsizedLarge() {
            return downsizedLarge;
        }

        public void setDownsizedLarge(DownsizedLarge downsizedLarge) {
            this.downsizedLarge = downsizedLarge;
        }

        public DownsizedMedium getDownsizedMedium() {
            return downsizedMedium;
        }

        public void setDownsizedMedium(DownsizedMedium downsizedMedium) {
            this.downsizedMedium = downsizedMedium;
        }

        public DownsizedSmall getDownsizedSmall() {
            return downsizedSmall;
        }

        public void setDownsizedSmall(DownsizedSmall downsizedSmall) {
            this.downsizedSmall = downsizedSmall;
        }

        public DownsizedStill getDownsizedStill() {
            return downsizedStill;
        }

        public void setDownsizedStill(DownsizedStill downsizedStill) {
            this.downsizedStill = downsizedStill;
        }

        public FixedHeight getFixedHeight() {
            return fixedHeight;
        }

        public void setFixedHeight(FixedHeight fixedHeight) {
            this.fixedHeight = fixedHeight;
        }

        public FixedHeightDownsampled getFixedHeightDownsampled() {
            return fixedHeightDownsampled;
        }

        public void setFixedHeightDownsampled(FixedHeightDownsampled fixedHeightDownsampled) {
            this.fixedHeightDownsampled = fixedHeightDownsampled;
        }

        public FixedHeightSmall getFixedHeightSmall() {
            return fixedHeightSmall;
        }

        public void setFixedHeightSmall(FixedHeightSmall fixedHeightSmall) {
            this.fixedHeightSmall = fixedHeightSmall;
        }

        public FixedHeightSmallStill getFixedHeightSmallStill() {
            return fixedHeightSmallStill;
        }

        public void setFixedHeightSmallStill(FixedHeightSmallStill fixedHeightSmallStill) {
            this.fixedHeightSmallStill = fixedHeightSmallStill;
        }

        public FixedHeightStill getFixedHeightStill() {
            return fixedHeightStill;
        }

        public void setFixedHeightStill(FixedHeightStill fixedHeightStill) {
            this.fixedHeightStill = fixedHeightStill;
        }

        public FixedWidth getFixedWidth() {
            return fixedWidth;
        }

        public void setFixedWidth(FixedWidth fixedWidth) {
            this.fixedWidth = fixedWidth;
        }

        public FixedWidthDownsampled getFixedWidthDownsampled() {
            return fixedWidthDownsampled;
        }

        public void setFixedWidthDownsampled(FixedWidthDownsampled fixedWidthDownsampled) {
            this.fixedWidthDownsampled = fixedWidthDownsampled;
        }

        public FixedWidthSmall getFixedWidthSmall() {
            return fixedWidthSmall;
        }

        public void setFixedWidthSmall(FixedWidthSmall fixedWidthSmall) {
            this.fixedWidthSmall = fixedWidthSmall;
        }

        public FixedWidthSmallStill getFixedWidthSmallStill() {
            return fixedWidthSmallStill;
        }

        public void setFixedWidthSmallStill(FixedWidthSmallStill fixedWidthSmallStill) {
            this.fixedWidthSmallStill = fixedWidthSmallStill;
        }

        public FixedWidthStill getFixedWidthStill() {
            return fixedWidthStill;
        }

        public void setFixedWidthStill(FixedWidthStill fixedWidthStill) {
            this.fixedWidthStill = fixedWidthStill;
        }

        public Looping getLooping() {
            return looping;
        }

        public void setLooping(Looping looping) {
            this.looping = looping;
        }

        public OriginalStill getOriginalStill() {
            return originalStill;
        }

        public void setOriginalStill(OriginalStill originalStill) {
            this.originalStill = originalStill;
        }

        public OriginalMp4 getOriginalMp4() {
            return originalMp4;
        }

        public void setOriginalMp4(OriginalMp4 originalMp4) {
            this.originalMp4 = originalMp4;
        }

        public Preview getPreview() {
            return preview;
        }

        public void setPreview(Preview preview) {
            this.preview = preview;
        }

        public PreviewGif getPreviewGif() {
            return previewGif;
        }

        public void setPreviewGif(PreviewGif previewGif) {
            this.previewGif = previewGif;
        }

        public PreviewWebp getPreviewWebp() {
            return previewWebp;
        }

        public void setPreviewWebp(PreviewWebp previewWebp) {
            this.previewWebp = previewWebp;
        }

        public com.example.gifapp._480wStill get480wStill() {
            return _480wStill;
        }

        public void set480wStill(com.example.gifapp._480wStill _480wStill) {
            this._480wStill = _480wStill;
        }

    }
class Looping {

        @SerializedName("mp4_size")
        @Expose
        private String mp4Size;
        @SerializedName("mp4")
        @Expose
        private String mp4;

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

    }
class Meta {

        @SerializedName("status")
        @Expose
        private Integer status;
        @SerializedName("msg")
        @Expose
        private String msg;
        @SerializedName("response_id")
        @Expose
        private String responseId;

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getResponseId() {
            return responseId;
        }

        public void setResponseId(String responseId) {
            this.responseId = responseId;
        }

    }

    class Onclick {

        @SerializedName("url")
        @Expose
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    class Onload {

        @SerializedName("url")
        @Expose
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    class Onsent {

        @SerializedName("url")
        @Expose
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    class Original {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("mp4_size")
        @Expose
        private String mp4Size;
        @SerializedName("mp4")
        @Expose
        private String mp4;
        @SerializedName("webp_size")
        @Expose
        private String webpSize;
        @SerializedName("webp")
        @Expose
        private String webp;
        @SerializedName("frames")
        @Expose
        private String frames;
        @SerializedName("hash")
        @Expose
        private String hash;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

        public String getWebpSize() {
            return webpSize;
        }

        public void setWebpSize(String webpSize) {
            this.webpSize = webpSize;
        }

        public String getWebp() {
            return webp;
        }

        public void setWebp(String webp) {
            this.webp = webp;
        }

        public String getFrames() {
            return frames;
        }

        public void setFrames(String frames) {
            this.frames = frames;
        }

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

    }
class OriginalMp4 {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("mp4_size")
        @Expose
        private String mp4Size;
        @SerializedName("mp4")
        @Expose
        private String mp4;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

    }

    class OriginalStill {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    class Pagination {

        @SerializedName("total_count")
        @Expose
        private Integer totalCount;
        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("offset")
        @Expose
        private Integer offset;

        public Integer getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Integer getOffset() {
            return offset;
        }

        public void setOffset(Integer offset) {
            this.offset = offset;
        }

    }

    class Preview {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("mp4_size")
        @Expose
        private String mp4Size;
        @SerializedName("mp4")
        @Expose
        private String mp4;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getMp4Size() {
            return mp4Size;
        }

        public void setMp4Size(String mp4Size) {
            this.mp4Size = mp4Size;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

    }

    class PreviewGif {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }
class PreviewWebp {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    class _480wStill {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("url")
        @Expose
        private String url;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }