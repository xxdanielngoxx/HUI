package com.github.xxdanielngoxx.hui.api.owner.controller.response;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class CheckOwnerPhoneNumberDuplicatedResponse {
  private boolean duplicated;
}