# ECA-Verifier-sensinact

To run the implementation, it requires to install the sensiNact studio (https://projects.eclipse.org/projects/technology.sensinact) and then connect to a sensinact gateway (https://projects.eclipse.org/projects/technology.sensinact), e.g. could be a localhost (127.0.0.1). 
In this repository, a workable version of sensiNact studio is already included.
The following outlined instructions for the Eclipse configuration to experiment iwth the ECA Verifier:
1. EMF transaction installation

    1.1 Go to Help / Install new software;

    1.2 Work with: http://download.eclipse.org/releases/oxygen (already existing);

    1.3 Select Modeling / EMF Model Transaction SDK;

    1.4 Install.
  
2. Install sensiNact studio

    2.1 Check: https://wiki.eclipse.org/SensiNact/studio-installation
    
3. Install sensiNact gateway
    
    3.1 check: https://wiki.eclipse.org/SensiNact/gateway-installation

4. Run the sensiNact studio from Eclipse, write two applications that contain conflicts, when deploying the second application, the conflict would then be detected automatically, and given recommended resolution the applications would be updated automatically with conflicts resolved.

5. A demo is shown here: https://youtu.be/5GAJcA_8UJ0 
