package com.carmel.bootcamp.carmelbootcampnalini;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.carmel.bootcamp.carmelbootcampnalini.Model.PreviewModel;

import java.util.ArrayList;

public class PreviewPageUsingModel extends AppCompatActivity {
    private TextView save_draft;
    private Button submit_button;

    ListView listView;
    ArrayList<PreviewModel>previewList=new ArrayList<>();
    ListView attachment_listview;
    ArrayList<PreviewModel>attachmentList=new ArrayList<>();
    ListView invitees_listview;
    ArrayList<PreviewModel>inviteesList=new ArrayList<>();
    ListView approvals_listview;
    ArrayList<PreviewModel>approvalsList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_page_using_model);

        save_draft=findViewById(R.id.savedraft);
        submit_button=findViewById(R.id.submitbtn);

        save_draft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentSaveDraftUsingModel fragmentSaveDraftUsingModel=new FragmentSaveDraftUsingModel();
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.preview_default_layout,fragmentSaveDraftUsingModel);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentRegisteredUsingModel fragmentRegisteredUsingModel=new FragmentRegisteredUsingModel();
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.preview_default_layout,fragmentRegisteredUsingModel);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });


        listView=findViewById(R.id.listview_container);
        attachment_listview=findViewById(R.id.listview_attachment);
        invitees_listview=findViewById(R.id.listview_invitees);
        approvals_listview=findViewById(R.id.listview_approvals);

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

        ListAdapter adapter=new ArrayAdapterPreview(getApplicationContext(),previewList);
        listView.setAdapter(adapter);




        PreviewModel previewModel1=new PreviewModel();
        previewModel1.setDocumentsize("976 KB");
        attachmentList.add(previewModel1);

        previewModel1=new PreviewModel();
        previewModel1.setDocumentsize("988 KB");
        attachmentList.add(previewModel1);

        ListAdapter adapter1=new ArrayAdapterPreviewAttachment(getApplicationContext(),attachmentList);
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

        ListAdapter adapter2=new ArrayAdapterPreviewInvitees(getApplicationContext(),inviteesList);
        invitees_listview.setAdapter(adapter2);



        PreviewModel previewModel3=new PreviewModel();
        previewModel3.setApprovalprofilenames("Karl jameson");
        approvalsList.add(previewModel3);

        previewModel3=new PreviewModel();
        previewModel3.setApprovalprofilenames("Crane Madey");
        approvalsList.add(previewModel3);

        ListAdapter adapter3=new ArrayAdapterPreviewApprovals(getApplicationContext(),approvalsList);
        approvals_listview.setAdapter(adapter3);

    }
}
