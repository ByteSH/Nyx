package com.connect.Nyx.service;

import com.connect.Nyx.io.ProfileRequest;
import com.connect.Nyx.io.ProfileResponse;

public interface ProfileServices {

    ProfileResponse createProfile(ProfileRequest request);
}
