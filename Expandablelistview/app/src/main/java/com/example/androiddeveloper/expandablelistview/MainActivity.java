package com.example.androiddeveloper.expandablelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExpandableListView elv = (ExpandableListView)findViewById(R.id.list);

        // 準備一級清單中顯示的資料:2個一級清單,分別顯示"group1"和"group2"
        List<Map<String, String>> groups = new ArrayList<Map<String, String>>();
        Map<String, String> group1 = new HashMap<String, String>();
        String Fragment1_maubset_Group1_Name = getResources().getString(R.string.Fragment1_maubset_Group1_Name);
        group1.put("group", Fragment1_maubset_Group1_Name);

        Map<String, String> group2 = new HashMap<String, String>();
        String Fragment1_maubset_Group2_Name = getResources().getString(R.string.Fragment1_maubset_Group2_Name);
        group2.put("group", Fragment1_maubset_Group2_Name);

        Map<String, String> group3 = new HashMap<String, String>();
        String Fragment1_maubset_Group3_Name = getResources().getString(R.string.Fragment1_maubset_Group3_Name);;
        group3.put("group", Fragment1_maubset_Group3_Name);
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);

        // 準備第一個一級清單中的二級清單資料:兩個二級清單,分別顯示"childData1"和"childData2"
        List<Map<String, String>> child1 = new ArrayList<Map<String, String>>();

        Map<String, String> child1Data1 = new HashMap<String, String>();
        String Fragment1_maubset_child0_Name0 = getResources().getString(R.string.Fragment1_maubset_child0_Name0);
        child1Data1.put("child", Fragment1_maubset_child0_Name0);

        Map<String, String> child1Data2 = new HashMap<String, String>();
        String Fragment1_maubset_child0_Name1 = getResources().getString(R.string.Fragment1_maubset_child0_Name1);
        child1Data2.put("child", Fragment1_maubset_child0_Name1);

        Map<String, String> child1Data3 = new HashMap<String, String>();
        String Fragment1_maubset_child0_Name2 = getResources().getString(R.string.Fragment1_maubset_child0_Name2);
        child1Data3.put("child", Fragment1_maubset_child0_Name2);

        Map<String, String> child1Data4 = new HashMap<String, String>();
        String Fragment1_maubset_child0_Name3 = getResources().getString(R.string.Fragment1_maubset_child0_Name3);
        child1Data4.put("child", Fragment1_maubset_child0_Name3);

        Map<String, String> child1Data5 = new HashMap<String, String>();
        String Fragment1_maubset_child0_Name4 = getResources().getString(R.string.Fragment1_maubset_child0_Name4);
        child1Data5.put("child", Fragment1_maubset_child0_Name4);

        child1.add(child1Data1);
        child1.add(child1Data2);
        child1.add(child1Data3);
        child1.add(child1Data4);
        child1.add(child1Data5);

        // 準備第二個一級清單中的二級清單資料:一個二級清單,顯示"child2Data1"
        List<Map<String, String>> child2 = new ArrayList<Map<String, String>>();

        Map<String, String> child2Data1 = new HashMap<String, String>();
        String Fragment1_maubset_child1_Name0 = getResources().getString(R.string.Fragment1_maubset_child1_Name0);
        child2Data1.put("child", Fragment1_maubset_child1_Name0);

        Map<String, String> child2Data2 = new HashMap<String, String>();
        String Fragment1_maubset_child1_Name1 = getResources().getString(R.string.Fragment1_maubset_child1_Name1);
        child2Data2.put("child", Fragment1_maubset_child1_Name1);

        Map<String, String> child2Data3 = new HashMap<String, String>();
        String Fragment1_maubset_child1_Name2 = getResources().getString(R.string.Fragment1_maubset_child1_Name2);
        child2Data3.put("child", Fragment1_maubset_child1_Name2);

        child2.add(child2Data1);
        child2.add(child2Data2);
        child2.add(child2Data3);

        List<Map<String, String>> child3 = new ArrayList<Map<String, String>>();

        Map<String, String> child3Data1 = new HashMap<String, String>();
        String Fragment1_maubset_child2_Name0 = getResources().getString(R.string.Fragment1_maubset_child2_Name0);
        child3Data1.put("child", Fragment1_maubset_child2_Name0);

        Map<String, String> child3Data2 = new HashMap<String, String>();
        String Fragment1_maubset_child2_Name1 = getResources().getString(R.string.Fragment1_maubset_child2_Name1);
        child3Data2.put("child", Fragment1_maubset_child2_Name1);

        Map<String, String> child3Data3 = new HashMap<String, String>();
        String Fragment1_maubset_child2_Name2 = getResources().getString(R.string.Fragment1_maubset_child2_Name2);
        child3Data3.put("child", Fragment1_maubset_child2_Name2);

        Map<String, String> child3Data4 = new HashMap<String, String>();
        String Fragment1_maubset_child2_Name3 = getResources().getString(R.string.Fragment1_maubset_child2_Name3);
        child3Data4.put("child", Fragment1_maubset_child2_Name3);

        child3.add(child3Data1);
        child3.add(child3Data2);
        child3.add(child3Data3);
        child3.add(child3Data4);

        // 用一個list物件保存所有的二級清單資料
        List<List<Map<String, String>>> childs = new ArrayList<List<Map<String, String>>>();
        childs.add(child1);
        childs.add(child2);
        childs.add(child3);

        //將 array 提出打包
        String BootMode[] = getResources().getStringArray(R.array.BootMode);
        String LaunchMode[] = getResources().getStringArray(R.array.LaunchMode);
        String DisableShutdown[] = getResources().getStringArray(R.array.DisableShutdown);
        String TakeOver_Release[] = getResources().getStringArray(R.array.TakeOver_Release);
        String TakeOver_ReleaseSelect[] = getResources().getStringArray(R.array.TakeOver_ReleaseSelect);
        String FlashingTime[] = getResources().getStringArray(R.array.FlashingTime);
        String TransmitPower[] = getResources().getStringArray(R.array.TransmitPower);
        String E_Copy[] = getResources().getStringArray(R.array.E_Copy);
        String Alarm_ONOFF[] = getResources().getStringArray(R.array.Alarm_ONOFF);
        String DisableShutdown_time[] = getResources().getStringArray(R.array.DisableShutdown_time);
        String InterferenceAction[] = getResources().getStringArray(R.array.InterferenceAction);
        String InterferenceAction_time[] = getResources().getStringArray(R.array.InterferenceAction_time);

        //將 spinner 內的 array-string 打包成二維陣列傳過去
        String [][] data = { BootMode , LaunchMode , DisableShutdown , TakeOver_Release , TakeOver_ReleaseSelect , FlashingTime , TransmitPower , E_Copy , Alarm_ONOFF , DisableShutdown_time , InterferenceAction , InterferenceAction_time};

        ExpandableAdapter viewAdapter = new ExpandableAdapter(this, groups, childs , data);
        elv.setAdapter(viewAdapter);
    }
}
