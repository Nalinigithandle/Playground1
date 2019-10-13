package com.carmel.bootcamp.carmelbootcampnalini;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.carmel.bootcamp.carmelbootcampnalini.Model.PreviewModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPreviewpage extends Fragment {
    private TextView save_draft;
    private Button submit_button;

    ListView listView;
    private View view;
    ArrayList<PreviewModel> previewList=new ArrayList<>();
    ListView attachment_listview;
    ArrayList<PreviewModel>attachmentList=new ArrayList<>();
    ListView invitees_listview;
    ArrayList<PreviewModel>inviteesList=new ArrayList<>();
    ListView approvals_listview;
    ArrayList<PreviewModel>approvalsList=new ArrayList<>();
    private String json_stringforapprovals= "{\"APPROVALS\":[{\"name\":\"Luke Ray\",\"description\":\"Lorem ipsum dolor sit amet,consectetur adipiscing elit\"},"+
            "{\"name\":\"Daisy Lake\",\"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit\"}]}";



    public FragmentPreviewpage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_fragment_previewpage, container, false);
        listView=view.findViewById(R.id.listview_container);
        attachment_listview=view.findViewById(R.id.listview_attachment);
        invitees_listview=view.findViewById(R.id.listview_invitees);
        approvals_listview=view.findViewById(R.id.listview_approvals);

        submit_button=view.findViewById(R.id.submitbtn);
        save_draft=view.findViewById(R.id.savedraft);

        save_draft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.preview_main_container,new FragmentSaveDraft());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.preview_main_container,new FragmentRegistered());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        PreviewModel previewModel=new PreviewModel();
        previewModel.setDescription("Lenovo ThinkServer TS450 (PN:70M2001VIH) With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5”(3.3 GHz /Cache 8 MB)/ STD MEMORY 8GB X");
        previewList.add(previewModel);
        previewModel=new PreviewModel();
        previewModel.setDescription("IBM X3300M4 Server With x3300M4/ Part NO:7382IA4/ Intel Xeon E5 1230v2 1.8 GHz,10 MB,1066MHz/ 1x 8GB RAM/ 1x500GB SATA HDD/ 3.5Simple-Swap/ MULTI BUTRNER");
        previewList.add(previewModel);
        previewModel=new PreviewModel();
        previewModel.setDescription("IBM Lenovo ThinkServer RD450 Rack Server (PN:70Q90059IH) with 1 x Intel® Xeon® E5-2620v4 (2.1GHz/8C/20MB/85W/2133Mhz)/Max: 2 Processors/ STD MEMORY 16GB X 1 MAX. MEMORY 1 TB ;16 Slots/ HARD DRIVE : Open Bay (2.5” HOT Swap SAS/SATA STD. HDD BAY 8 bay / MAX. HDD BAY 16 bay with optical bay/24 bay without optical bay) / OPTICAL Multi Burner/ Integrated RAID 0,1,10 (RAID 110i.");
        previewList.add(previewModel);
        previewModel=new PreviewModel();
        previewModel.setDescription("IBM Lenovo ThinkServer RD450 Rack Server (PN:70Q90059IH) with 1 x Intel® Xeon® E5-2620v4 (2.1GHz/8C/20MB/85W/2133Mhz)/Max: 2 Processors/ STD MEMORY 16GB X 1 MAX. MEMORY 1 TB ;16 Slots/ HARD DRIVE : Open Bay (2.5” HOT Swap SAS/SATA STD. HDD BAY 8 bay / MAX. HDD BAY 16 bay with optical bay/24 bay without optical bay) / OPTICAL Multi Burner/ Integrated RAID 0,1,10 (RAID 110i). Supports only SATA drive/ Power Supply Standard (Inbuilt) 1 x 750W Power Supply Max: 2");
        previewList.add(previewModel);
        previewModel=new PreviewModel();
        previewModel.setDescription("daptec 128 MB Raid Controller Pair. Pci-e SAS/SATA");
        previewList.add(previewModel);
        ListAdapter adapter=new ArrayAdapterPreview(view.getContext(),previewList);
        listView.setAdapter(adapter);


        PreviewModel previewModel1=new PreviewModel();
        previewModel1.setDocumentsize("976 KB");
        attachmentList.add(previewModel1);
        previewModel1=new PreviewModel();
        previewModel1.setDocumentsize("988 KB");
        attachmentList.add(previewModel1);
        ListAdapter adapter1=new ArrayAdapterPreviewAttachment(view.getContext(),attachmentList);
        attachment_listview.setAdapter(adapter1);

        PreviewModel previewModel2=new PreviewModel();
        previewModel2.setProfilename("Luke Ray");
        inviteesList.add(previewModel2);
        previewModel2=new PreviewModel();
        previewModel2.setProfilename("John Canery");
        inviteesList.add(previewModel2);
        previewModel2=new PreviewModel();
        previewModel2.setProfilename("James Smith");
        inviteesList.add(previewModel2);
        ListAdapter adapter2=new ArrayAdapterPreviewInvitees(view.getContext(),inviteesList);
        invitees_listview.setAdapter(adapter2);

        try {
            JSONObject objectapproval=new JSONObject(json_stringforapprovals);
            JSONArray jsonArray=objectapproval.optJSONArray("APPROVALS");
            for (int i=0; i < jsonArray.length();i++) {
                JSONObject jsonObject=jsonArray.getJSONObject(i);
                String approvedPersonName=jsonObject.optString("name");
                String approvedPersonDescription=jsonObject.optString("description");
                PreviewModel previewModel3=new PreviewModel();
                previewModel3.setApprovalprofilenames(approvedPersonName);
                previewModel3.setApprovalprofiledescriptions(approvedPersonDescription);
                approvalsList.add(previewModel3);
            }
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        ListAdapter adapter3=new ArrayAdapterPreviewApprovals(view.getContext(),approvalsList);
        approvals_listview.setAdapter(adapter3);
        return view;
    }
}
