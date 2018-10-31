package com.example.androiddeveloper.expandablelistview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseExpandableListAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class ExpandableAdapter extends BaseExpandableListAdapter
{
    private Context context;
    List<Map<String, String>> groups;
    List<List<Map<String, String>>> childs;
    String[][] data;
    MySpinnerAdapter Data_spinnerAdapter;
    protected LayoutInflater mInflater;
    /*
     * 構造函數: 參數1:context物件 參數2:一級清單資料來源 參數3:二級清單資料來源
     */
    public ExpandableAdapter(Context context, List<Map<String, String>> groups, List<List<Map<String, String>>> childs , String[][] data)
    {
        this.groups = groups;
        this.childs = childs;
        this.context = context;
        this.data = data;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public Object getChild(int groupPosition, int childPosition)
    {
        return childs.get(groupPosition).get(childPosition);
    }

    public long getChildId(int groupPosition, int childPosition)
    {
        return getCombinedChildId(groupPosition,childPosition);
    }

    // 獲取二級清單的View物件
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent)
    {
        ViewHolderChild viewHolderChild = null;
        String text = ((Map<String, String>) getChild(groupPosition, childPosition)).get("child");
        if (convertView == null)
        {
            viewHolderChild = new ViewHolderChild();
            convertView = mInflater.inflate(R.layout.child, parent, false);
            viewHolderChild.ChildTextView = (TextView) convertView.findViewById(R.id.child_tv);
            viewHolderChild.ChildSpinner = (Spinner) convertView.findViewById(R.id.child_sp);
            convertView.setTag(viewHolderChild);
        }
        else
        {
            viewHolderChild = (ViewHolderChild) convertView.getTag();
        }
        viewHolderChild.ChildTextView.setText(text);
        Data_spinnerAdapter = new MySpinnerAdapter(context , data[1]);
        if( (groupPosition == 0) & (childPosition == 0))
        {
            MySpinnerAdapter Data_spinnerAdapter = new MySpinnerAdapter(context , data[0]);
            viewHolderChild.ChildSpinner.setAdapter(Data_spinnerAdapter);
            viewHolderChild.ChildSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                {

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                {

                }
            });
        }
        else if( (groupPosition == 0) & (childPosition == 1))
        {
            Data_spinnerAdapter = new MySpinnerAdapter(context , data[1]);
            viewHolderChild.ChildSpinner.setAdapter(Data_spinnerAdapter);
            viewHolderChild.ChildSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                {

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                {

                }
            });
        }
        else if( (groupPosition == 0) & (childPosition == 2))
        {
            MySpinnerAdapter Data_spinnerAdapter = new MySpinnerAdapter(context , data[2]);
            viewHolderChild.ChildSpinner.setAdapter(Data_spinnerAdapter);
            viewHolderChild.ChildSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                {

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                {

                }
            });
        }
        else if( (groupPosition == 0) & (childPosition == 3))
        {
            MySpinnerAdapter Data_spinnerAdapter = new MySpinnerAdapter(context , data[3]);
            viewHolderChild.ChildSpinner.setAdapter(Data_spinnerAdapter);
            viewHolderChild.ChildSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                {

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                {

                }
            });
        }
        else if( (groupPosition == 0) & (childPosition == 4))
        {
            MySpinnerAdapter Data_spinnerAdapter = new MySpinnerAdapter(context , data[4]);
            viewHolderChild.ChildSpinner.setAdapter(Data_spinnerAdapter);
            viewHolderChild.ChildSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                {

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                {

                }
            });
        }
        else if( (groupPosition == 1) & (childPosition == 0))
        {
            MySpinnerAdapter Data_spinnerAdapter = new MySpinnerAdapter(context , data[5]);
            viewHolderChild.ChildSpinner.setAdapter(Data_spinnerAdapter);
            viewHolderChild.ChildSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                {

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                {

                }
            });
        }
        else if( (groupPosition == 1) & (childPosition == 1))
        {
            MySpinnerAdapter Data_spinnerAdapter = new MySpinnerAdapter(context , data[6]);
            viewHolderChild.ChildSpinner.setAdapter(Data_spinnerAdapter);
            viewHolderChild.ChildSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                {

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                {

                }
            });
        }
        else if( (groupPosition == 1) & (childPosition == 2))
        {
            MySpinnerAdapter Data_spinnerAdapter = new MySpinnerAdapter(context , data[7]);
            viewHolderChild.ChildSpinner.setAdapter(Data_spinnerAdapter);
            viewHolderChild.ChildSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                {

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                {

                }
            });
        }
        else if( (groupPosition == 2) & (childPosition == 0))
        {
            MySpinnerAdapter Data_spinnerAdapter = new MySpinnerAdapter(context , data[8]);
            viewHolderChild.ChildSpinner.setAdapter(Data_spinnerAdapter);
            viewHolderChild.ChildSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                {

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                {

                }
            });
        }
        else if( (groupPosition == 2) & (childPosition == 1))
        {
            MySpinnerAdapter Data_spinnerAdapter = new MySpinnerAdapter(context , data[9]);
            viewHolderChild.ChildSpinner.setAdapter(Data_spinnerAdapter);
            viewHolderChild.ChildSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                {

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                {

                }
            });
        }
        else if( (groupPosition == 2) & (childPosition == 2))
        {
            MySpinnerAdapter Data_spinnerAdapter = new MySpinnerAdapter(context , data[10]);
            viewHolderChild.ChildSpinner.setAdapter(Data_spinnerAdapter);
            viewHolderChild.ChildSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                {

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                {

                }
            });
        }
        else if( (groupPosition == 2) & (childPosition == 3))
        {
            MySpinnerAdapter Data_spinnerAdapter = new MySpinnerAdapter(context , data[11]);
            viewHolderChild.ChildSpinner.setAdapter(Data_spinnerAdapter);
            viewHolderChild.ChildSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
            {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                {

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent)
                {

                }
            });
        }
        return convertView;
    }

    public int getChildrenCount(int groupPosition)
    {
        return childs.get(groupPosition).size();
    }

    public Object getGroup(int groupPosition)
    {
        return groups.get(groupPosition);
    }

    public int getGroupCount()
    {
        return groups.size();
    }

    public long getGroupId(int groupPosition)
    {
        return groupPosition;
    }

    // 獲取一級清單View物件
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent)
    {
        Log.i("EE","father");
        ViewHolerFather viewHolerFather = null;
        String text = groups.get(groupPosition).get("group");
        if (convertView == null)
        {
            viewHolerFather = new ViewHolerFather();
            convertView = mInflater.inflate(R.layout.group_layout, parent, false);
            viewHolerFather.FatherTextView = (TextView) convertView.findViewById(R.id.group_tv);
            convertView.setTag(viewHolerFather);
        }
        else
        {
            viewHolerFather = (ViewHolerFather) convertView.getTag();
        }
        viewHolerFather.FatherTextView.setText(text);
        return convertView;
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public boolean isChildSelectable(int groupPosition, int childPosition)
    {
        return false;
    }

    public static class ViewHolerFather
    {
        TextView FatherTextView;
    }

    public static class ViewHolderChild
    {
        TextView ChildTextView;
        Spinner ChildSpinner;
    }

}