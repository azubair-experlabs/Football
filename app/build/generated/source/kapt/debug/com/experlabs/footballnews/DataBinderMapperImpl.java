package com.experlabs.footballnews;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.experlabs.footballnews.databinding.ActivityPlayerBindingImpl;
import com.experlabs.footballnews.databinding.ActivityTeamBindingImpl;
import com.experlabs.footballnews.databinding.AddplayerItemBindingImpl;
import com.experlabs.footballnews.databinding.FactItemBindingImpl;
import com.experlabs.footballnews.databinding.FactsPopupBindingImpl;
import com.experlabs.footballnews.databinding.FragmentWeatherBindingImpl;
import com.experlabs.footballnews.databinding.GalleryItemBindingImpl;
import com.experlabs.footballnews.databinding.LinkItemBindingImpl;
import com.experlabs.footballnews.databinding.PlayerItemBindingImpl;
import com.experlabs.footballnews.databinding.TeamItemBindingImpl;
import com.experlabs.footballnews.databinding.VideoItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYPLAYER = 1;

  private static final int LAYOUT_ACTIVITYTEAM = 2;

  private static final int LAYOUT_ADDPLAYERITEM = 3;

  private static final int LAYOUT_FACTITEM = 4;

  private static final int LAYOUT_FACTSPOPUP = 5;

  private static final int LAYOUT_FRAGMENTWEATHER = 6;

  private static final int LAYOUT_GALLERYITEM = 7;

  private static final int LAYOUT_LINKITEM = 8;

  private static final int LAYOUT_PLAYERITEM = 9;

  private static final int LAYOUT_TEAMITEM = 10;

  private static final int LAYOUT_VIDEOITEM = 11;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(11);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.experlabs.footballnews.R.layout.activity_player, LAYOUT_ACTIVITYPLAYER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.experlabs.footballnews.R.layout.activity_team, LAYOUT_ACTIVITYTEAM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.experlabs.footballnews.R.layout.addplayer_item, LAYOUT_ADDPLAYERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.experlabs.footballnews.R.layout.fact_item, LAYOUT_FACTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.experlabs.footballnews.R.layout.facts_popup, LAYOUT_FACTSPOPUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.experlabs.footballnews.R.layout.fragment_weather, LAYOUT_FRAGMENTWEATHER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.experlabs.footballnews.R.layout.gallery_item, LAYOUT_GALLERYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.experlabs.footballnews.R.layout.link_item, LAYOUT_LINKITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.experlabs.footballnews.R.layout.player_item, LAYOUT_PLAYERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.experlabs.footballnews.R.layout.team_item, LAYOUT_TEAMITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.experlabs.footballnews.R.layout.video_item, LAYOUT_VIDEOITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYPLAYER: {
          if ("layout/activity_player_0".equals(tag)) {
            return new ActivityPlayerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_player is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTEAM: {
          if ("layout/activity_team_0".equals(tag)) {
            return new ActivityTeamBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_team is invalid. Received: " + tag);
        }
        case  LAYOUT_ADDPLAYERITEM: {
          if ("layout/addplayer_item_0".equals(tag)) {
            return new AddplayerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for addplayer_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FACTITEM: {
          if ("layout/fact_item_0".equals(tag)) {
            return new FactItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fact_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FACTSPOPUP: {
          if ("layout/facts_popup_0".equals(tag)) {
            return new FactsPopupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for facts_popup is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTWEATHER: {
          if ("layout/fragment_weather_0".equals(tag)) {
            return new FragmentWeatherBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_weather is invalid. Received: " + tag);
        }
        case  LAYOUT_GALLERYITEM: {
          if ("layout/gallery_item_0".equals(tag)) {
            return new GalleryItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for gallery_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LINKITEM: {
          if ("layout/link_item_0".equals(tag)) {
            return new LinkItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for link_item is invalid. Received: " + tag);
        }
        case  LAYOUT_PLAYERITEM: {
          if ("layout/player_item_0".equals(tag)) {
            return new PlayerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for player_item is invalid. Received: " + tag);
        }
        case  LAYOUT_TEAMITEM: {
          if ("layout/team_item_0".equals(tag)) {
            return new TeamItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for team_item is invalid. Received: " + tag);
        }
        case  LAYOUT_VIDEOITEM: {
          if ("layout/video_item_0".equals(tag)) {
            return new VideoItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for video_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(13);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "air_item");
      sKeys.put(2, "condtion_item");
      sKeys.put(3, "currentWeather_item");
      sKeys.put(4, "factItem");
      sKeys.put(5, "gallery_item");
      sKeys.put(6, "index");
      sKeys.put(7, "linkItem");
      sKeys.put(8, "location_item");
      sKeys.put(9, "playerItem");
      sKeys.put(10, "player_item");
      sKeys.put(11, "teamItem");
      sKeys.put(12, "videoItem");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(11);

    static {
      sKeys.put("layout/activity_player_0", com.experlabs.footballnews.R.layout.activity_player);
      sKeys.put("layout/activity_team_0", com.experlabs.footballnews.R.layout.activity_team);
      sKeys.put("layout/addplayer_item_0", com.experlabs.footballnews.R.layout.addplayer_item);
      sKeys.put("layout/fact_item_0", com.experlabs.footballnews.R.layout.fact_item);
      sKeys.put("layout/facts_popup_0", com.experlabs.footballnews.R.layout.facts_popup);
      sKeys.put("layout/fragment_weather_0", com.experlabs.footballnews.R.layout.fragment_weather);
      sKeys.put("layout/gallery_item_0", com.experlabs.footballnews.R.layout.gallery_item);
      sKeys.put("layout/link_item_0", com.experlabs.footballnews.R.layout.link_item);
      sKeys.put("layout/player_item_0", com.experlabs.footballnews.R.layout.player_item);
      sKeys.put("layout/team_item_0", com.experlabs.footballnews.R.layout.team_item);
      sKeys.put("layout/video_item_0", com.experlabs.footballnews.R.layout.video_item);
    }
  }
}
