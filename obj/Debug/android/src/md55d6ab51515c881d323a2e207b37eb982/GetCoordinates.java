package md55d6ab51515c881d323a2e207b37eb982;


public class GetCoordinates
	extends android.os.AsyncTask
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPreExecute:()V:GetOnPreExecuteHandler\n" +
			"n_doInBackground:([Ljava/lang/Object;)Ljava/lang/Object;:GetDoInBackground_arrayLjava_lang_Object_Handler\n" +
			"n_onPostExecute:(Ljava/lang/Object;)V:GetOnPostExecute_Ljava_lang_Object_Handler\n" +
			"";
		mono.android.Runtime.register ("XamarinGeocoding.GetCoordinates, XamarinGeocoding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", GetCoordinates.class, __md_methods);
	}


	public GetCoordinates () throws java.lang.Throwable
	{
		super ();
		if (getClass () == GetCoordinates.class)
			mono.android.TypeManager.Activate ("XamarinGeocoding.GetCoordinates, XamarinGeocoding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public GetCoordinates (md55d6ab51515c881d323a2e207b37eb982.MainActivity p0, android.content.Context p1) throws java.lang.Throwable
	{
		super ();
		if (getClass () == GetCoordinates.class)
			mono.android.TypeManager.Activate ("XamarinGeocoding.GetCoordinates, XamarinGeocoding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "XamarinGeocoding.MainActivity, XamarinGeocoding, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null:Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public void onPreExecute ()
	{
		n_onPreExecute ();
	}

	private native void n_onPreExecute ();


	public java.lang.Object doInBackground (java.lang.Object[] p0)
	{
		return n_doInBackground (p0);
	}

	private native java.lang.Object n_doInBackground (java.lang.Object[] p0);


	public void onPostExecute (java.lang.Object p0)
	{
		n_onPostExecute (p0);
	}

	private native void n_onPostExecute (java.lang.Object p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
