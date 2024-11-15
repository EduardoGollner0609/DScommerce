import { CredentialsDTO } from "../models/auth";
import { CLIENT_ID, CLIENT_SECRET } from "./system";

export function loginRequest(loginData: CredentialsDTO) {
  const headers = {
    "Content-Type": "application/x-www-form-urlencoded",
    Authorization: "Basic " + window.btoa(CLIENT_ID + ":" + CLIENT_SECRET),
  };
}
