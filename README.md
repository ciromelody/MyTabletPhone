# MyTabletPhone
show right layout for my  tablet o phone
This is a simple example to create separate phone and tablet layouts.
just create a folder (under / res) for tablets with the following wording layout-sw600dp and inside
insert the layout_activity.xml for tablet. For landscape viewing just create another folder named layout-sw600dp-land.

There are also two "-land" folders that allow you to differentiate the layout from vertical to horizontal.

Images can also be chosen based on the type of phone or tablet device:
create a folder  for tablets with the following wording:drawable-sw600dp-land,drawble-sw600dp for tablet.

From program to know if the user uses a tablet or a phone, I insert in the layout_activity of the tablet a 
resource (  android:id="@+id/id_textview_tablet") that doesn't exist in the layout_activity of the phone.
At this point it is sufficient to check the resource to know if the resource exists->
if (findViewById(R.id.id_textview_tablet) != null){
            Toast.makeText(this,"I am a Tablet !",Toast.LENGTH_LONG).show();
        }
