package com.hua.news.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;

import com.hua.news.bean.NewModle;

/**
 * this is to help the newsFragments to init their layout and data
 * @author zero
 *
 */
public class LayoutUtils {

	private static Context context;
	
    /**this is to help the newsFragments 初始化 数据源 例如 集合、url的map集合、等
     * @param listsModles 数据集合 ,用于点击item时 传入的数ju
     * @param  作为head bar部分 的图片的跳转对应连接的url集合
     * @param  作为head bar部分的图片的url集合
     * */
    public static void init(Context mContext,List<NewModle> listsModles,Map<String, String> url_maps,Map<String, NewModle> newHashMap) {
//    	LogUtils2.d("what is the value of index = "+index);
    	context = mContext;
        listsModles = new ArrayList<NewModle>();
        url_maps = new HashMap<String, String>();
        newHashMap = new HashMap<String, NewModle>();
    }
	
	
}
