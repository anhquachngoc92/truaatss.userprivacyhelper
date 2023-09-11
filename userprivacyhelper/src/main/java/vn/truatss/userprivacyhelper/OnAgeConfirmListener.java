package vn.truatss.userprivacyhelper;

public interface OnAgeConfirmListener {

    enum AgeType {
        UNDER_13,
        THIRTEEN_TO_FIFTEEN,
        SIXTEN_OR_OLDER
    }

    void onAgeConfirm(AgeType ageType);
}
