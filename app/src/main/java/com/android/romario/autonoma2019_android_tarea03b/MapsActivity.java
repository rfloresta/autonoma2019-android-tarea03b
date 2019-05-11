package com.android.romario.autonoma2019_android_tarea03b;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng transporte=new  LatLng(-12.1965287, -76.9704053);
        LatLng restaurant = new LatLng(-12.1959972, -76.9724176);
        LatLng universidad=new  LatLng(-12.1955257, -76.9717277);
        mMap.addMarker(new MarkerOptions().position(restaurant).title("Restaurante"));
        mMap.addMarker(new MarkerOptions().position(transporte).title("Transporte"));
        mMap.addMarker(new MarkerOptions().position(universidad).title("Universidad"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(universidad));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(transporte));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(restaurant));
    }
}
